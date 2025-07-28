package Bloaters;

public class LongParameterList {

    public void createOrder(String customerName, String customerAddressStreet, String customerAddressCity,
                            String customerAddressZip, String productId, int quantity, double unitPrice,
                            String paymentMethod, String shippingMethod, String notes,
                            boolean giftWrap, String giftMessage) {
        // Lógica para crear un pedido con todos estos detalles
        // ...
    }

    /*
     * El método createOrder tiene una cantidad excesiva de parámetros. Esto lo hace muy difícil de leer y entender, 
     * ya que hay que recordar el propósito de cada argumento en el orden correcto. Cualquier cambio en los requisitos del pedido 
     * (añadir o quitar un campo) implicaría modificar la firma del método y todos sus puntos de llamada, lo que es propenso a errores 
     * y requiere mucho trabajo. 
     */
}
