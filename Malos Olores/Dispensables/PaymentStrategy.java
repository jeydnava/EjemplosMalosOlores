package Dispensables;

//EJEMPLO DE Speculative Generality 
public interface PaymentStrategy { // Interfaz con muchas implementaciones "futuras"
    void pay(double amount);
    void refund(double amount);
    void authorize(double amount);
    void capture(double amount);
    void voidTransaction(String transactionId);
    // ... y más métodos para todos los escenarios de pago imaginables
}

public class CreditCardPayment implements PaymentStrategy {
    @Override
    public void pay(double amount) { /* ... */ }
    @Override
    public void refund(double amount) { /* ... */ }
    @Override
    public void authorize(double amount) { /* ... */ } // No implementado completamente si no se usa
    @Override
    public void capture(double amount) { /* ... */ }   // No implementado completamente si no se usa
    @Override
    public void voidTransaction(String transactionId) { /* ... */ } // No implementado completamente si no se usa
}

// Actualmente, solo se usa 'pay' y 'refund' en el sistema
/*
 * La interfaz PaymentStrategy incluye una gran cantidad de métodos (authorize, capture, voidTransaction, etc.) que están pensados 
 * para manejar futuros escenarios de pago y diferentes tipos de pasarelas, pero que actualmente no se utilizan o solo se implementan 
 * de forma parcial o con stubs en las clases concretas (como CreditCardPayment). Esta "generalidad especulativa" introduce una 
 * complejidad innecesaria en el diseño, haciendo que el código sea más difícil de entender y de mantener, sin aportar un beneficio 
 * inmediato que justifique esa complejidad adicional. 
 */
