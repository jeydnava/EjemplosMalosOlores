package Bloaters;

//Ejemplo de Data Clumps
public class ReportGenerator {
    public void generateCustomerReport(String customerName, String customerStreet, String customerCity, String customerZipCode) {
        System.out.println("Generating report for: " + customerName);
        System.out.println("Address: " + customerStreet + ", " + customerCity + " " + customerZipCode);
        // ... más lógica de reporte
    }

    public void updateShippingAddress(String newStreet, String newCity, String newZipCode, String customerId) {
        // Lógica para actualizar la dirección de envío en la base de datos
        // ...
    }

    /*
     * Las variables customerStreet, customerCity, y customerZipCode (o newStreet, newCity, newZipCode) siempre aparecen juntas 
     * en diferentes métodos. Este grupo de datos (calle, ciudad, código postal) representa una entidad conceptual única: 
     * una dirección. La repetición de este grupo en las firmas de los métodos y en la lógica dispersa indica que deberían 
     * estar encapsuladas en su propia clase, lo que mejoraría la cohesión y reduciría la redundancia. 
     */
}
