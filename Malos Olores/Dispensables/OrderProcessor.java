package Dispensables;

//Ejemplo de Duplicate Code
public class OrderProcessor {
    public void processRetailOrder(RetailOrder order) {
        // Lógica de validación común
        if (order.getCustomerId() == null || order.getCustomerId().isEmpty()) {
            throw new IllegalArgumentException("Customer ID is required.");
        }
        if (order.getTotalAmount() <= 0) {
            throw new IllegalArgumentException("Total amount must be positive.");
        }
        // ... otras validaciones

        // Lógica de guardado en la base de datos
        System.out.println("Saving retail order to DB: " + order.getId());
        // ... SQL para guardar
    }

    public void processWholesaleOrder(WholesaleOrder order) {
        // Lógica de validación común (DUPLICADA)
        if (order.getCustomerId() == null || order.getCustomerId().isEmpty()) {
            throw new IllegalArgumentException("Customer ID is required.");
        }
        if (order.getTotalAmount() <= 0) {
            throw new IllegalArgumentException("Total amount must be positive.");
        }
        // ... otras validaciones

        // Lógica de guardado en la base de datos (DUPLICADA)
        System.out.println("Saving wholesale order to DB: " + order.getId());
        // ... SQL para guardar
    }
}

/*
 * Los bloques de código para "Lógica de validación común" y "Lógica de guardado en la base de datos" son idénticos o casi idénticos 
 * en ambos métodos (processRetailOrder y processWholesaleOrder). Este código duplicado hace que el mantenimiento sea más difícil; 
 * si se necesita cambiar la lógica de validación o el proceso de guardado, se tendría que hacer en múltiples lugares, lo que aumenta 
 * la probabilidad de errores y consume más tiempo. 
 */
