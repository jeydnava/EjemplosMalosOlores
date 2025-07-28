package OOAbusers;

//Ejemplo de Switch Statements
public class PaymentProcessor {
    public double processPayment(double amount, String paymentType) {
        double processedAmount = 0;
        switch (paymentType) {
            case "CreditCard":
                // Lógica para procesar tarjeta de crédito
                processedAmount = amount * 1.02; // 2% de comisión
                break;
            case "PayPal":
                // Lógica para procesar PayPal
                processedAmount = amount * 1.03; // 3% de comisión
                break;
            case "BankTransfer":
                // Lógica para procesar transferencia bancaria
                processedAmount = amount * 1.01; // 1% de comisión
                break;
            default:
                throw new IllegalArgumentException("Unknown payment type: " + paymentType);
        }
        // ... más lógica común
        return processedAmount;
    }

    /*
     * El método processPayment utiliza una sentencia switch para determinar la lógica de procesamiento basada en el paymentType. 
     * Si se añade un nuevo tipo de pago (por ejemplo, "Crypto"), se deberá modificar esta clase (PaymentProcessor) y potencialmente 
     * otras clases que también usen switch para paymentType. Esto viola el Principio Abierto/Cerrado (Open/Closed Principle), 
     * que establece que las entidades de software (clases, módulos, funciones, etc.) deben estar abiertas para la extensión, 
     * pero cerradas para la modificación.
     */
}
