package Couplers;

import java.util.ArrayList;
import java.util.List;

//Ejemplo de Inappropriate Intimacy
public class Customer {
    private String customerId;
    private OrderHistory orderHistory; // Conoce los detalles de la implementación de OrderHistory

    public Customer(String customerId) {
        this.customerId = customerId;
        this.orderHistory = new OrderHistory();
    }

    public void addOrder(Order order) {
        // Accede directamente a un método interno de OrderHistory
        this.orderHistory.addInternalOrder(order);
    }

    public int getNumberOfOrders() {
        // Accede directamente a un detalle interno de OrderHistory
        return this.orderHistory.getOrdersList().size();
    }
}

public class OrderHistory {
    private List<Order> orders; // Debería ser privado y gestionado internamente

    public OrderHistory() {
        this.orders = new ArrayList<>();
    }

    // Método que no debería ser público si Customer lo manipula directamente
    public void addInternalOrder(Order order) {
        this.orders.add(order);
    }

    // Getter que expone la estructura interna, permitiendo la manipulación externa
    public List<Order> getOrdersList() {
        return orders;
    }
}

/*
 * La clase Customer tiene una "intimidad inapropiada" con la clase OrderHistory. No solo conoce que Customer tiene un OrderHistory, 
 * sino que también accede a sus detalles de implementación (llamando a addInternalOrder y obteniendo la List interna a través 
 * de getOrdersList().size()). Esto crea un fuerte acoplamiento bidireccional, ya que si cambia la forma en que OrderHistory 
 * almacena o gestiona sus pedidos, Customer también podría necesitar modificaciones. OrderHistory debería controlar su propia 
 * lista de pedidos y exponer solo las operaciones de alto nivel que Customer necesita. 
 */