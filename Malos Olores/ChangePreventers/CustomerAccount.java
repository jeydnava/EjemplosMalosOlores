package ChangePreventers;
//Ejemplo de Shotgun Surgery
// Clases dispersas
public class CustomerAccount {
    public void debitAccount(double amount) { /* ... */ }
}

public class TransactionLogger {
    public void logDebitTransaction(String accountId, double amount) { /* ... */ }
}

public class NotificationService {
    public void sendDebitNotification(String email, double amount) { /* ... */ }
}

// Donde se usa la lógica de débito
public class PaymentService {
    private CustomerAccount account;
    private TransactionLogger logger;
    private NotificationService notifier;

    public PaymentService(CustomerAccount account, TransactionLogger logger, NotificationService notifier) {
        this.account = account;
        this.logger = logger;
        this.notifier = notifier;
    }

    public void makePayment(String customerId, double amount) {
        // Paso 1: Debitar la cuenta
        account.debitAccount(amount);

        // Paso 2: Registrar la transacción
        logger.logDebitTransaction(customerId, amount);

        // Paso 3: Enviar notificación al cliente
        String customerEmail = "customer@example.com"; // Obtener de algún lado
        notifier.sendDebitNotification(customerEmail, amount);
    }
}

/*
 * Si se necesita cambiar la forma en que se manejan las operaciones de débito 
 * (por ejemplo, añadir una validación de saldo previo, o implementar un sistema de auditoría adicional), el cambio no se puede realizar 
 * en un solo lugar. En este ejemplo, el proceso de "hacer un pago" implica modificar CustomerAccount para el débito, TransactionLogger 
 * para el registro, y NotificationService para la notificación. Un solo cambio conceptual ("cómo debitamos") requiere modificar 
 * múltiples clases. Esto es "cirugía con escopeta" porque se necesitan muchos pequeños "disparos" en diferentes lugares del código 
 * para implementar un único cambio. 
 */