package Dispensables;

//Ejemplo de Lazy Class
public class PaymentGatewayAdapter {
    private ThirdPartyPaymentGateway gateway;

    public PaymentGatewayAdapter(ThirdPartyPaymentGateway gateway) {
        this.gateway = gateway;
    }

    public boolean processTransaction(double amount, String currency) {
        // Este método simplemente delega la llamada a la clase subyacente
        return gateway.makePayment(amount, currency);
    }
}

public class ThirdPartyPaymentGateway {
    public boolean makePayment(double amount, String currency) {
        // Lógica real de procesamiento de pago
        return true;
    }
}

/*
 * La clase PaymentGatewayAdapter solo tiene un constructor y un método processTransaction, y este último simplemente llama a un método 
 * de la clase ThirdPartyPaymentGateway sin añadir ninguna lógica, validación o transformación adicional. Es una "clase perezosa" porque 
 * no hace lo suficiente para justificar su existencia; su función es puramente delegar, lo que añade una capa de indirección innecesaria 
 * y complejidad al código.
 */
