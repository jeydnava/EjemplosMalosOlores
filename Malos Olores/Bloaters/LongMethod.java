package Bloaters;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class LongMethod {
    public void processOrder(Order order) {
    // Validar el pedido:
    if (order.getId() == null || order.getId().isEmpty()) {
        throw new IllegalArgumentException("Order ID cannot be null or empty.");
    }
    if (order.getItems().isEmpty()) {
        throw new IllegalArgumentException("Order must contain items.");
    }
    // ... (muchas más validaciones de diferentes atributos y casos)

    // Calcular el precio total:
    double totalPrice = 0;
    for (OrderItem item : order.getItems()) {
        totalPrice += item.getQuantity() * item.getProduct().getPrice();
    }
    if (order.getDiscountCode() != null && !order.getDiscountCode().isEmpty()) {
        totalPrice *= 0.9; // Aplicar descuento del 10%
    }
    // ... (muchos cálculos de impuestos, envío, etc.)

    // Guardar el pedido en la base de datos:
    try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "user", "password");
        PreparedStatement stmt = conn.prepareStatement("INSERT INTO orders (id, customer_id, total_price, status) VALUES (?, ?, ?, ?)")) {
        stmt.setString(1, order.getId());
        stmt.setString(2, order.getCustomerId());
        stmt.setDouble(3, totalPrice);
        stmt.setString(4, "PENDING");
        stmt.executeUpdate();
    } catch (SQLException e) {
        System.err.println("Error saving order: " + e.getMessage());
    }
    // ... (guardar ítems del pedido, actualizar stock, etc.)

    // Enviar confirmación al cliente:
    String emailBody = "Estimado " + order.getCustomerName() + ",\nSu pedido " + order.getId() + " ha sido procesado. Total: " + totalPrice;
    EmailService.sendEmail(order.getCustomerEmail(), "Confirmación de Pedido", emailBody);
    // ... (lógica para adjuntar factura, enviar SMS, etc.)
    }

    /*
     * Este método es excesivamente largo, abarcando alrededor de 200-300 líneas de código).
     * Maneja al menos cuatro responsabilidades principales: validación, cálculo de precio, persistencia de datos y notificación. 
     * Debido a su tamaño, es difícil de leer, entender y probar, ya que un simple cambio en una de sus responsabilidades 
     * podría requerir una revisión de todo el método. 
     */
}