package Bloaters;

//Ejemplo de Primitive Obsession
public class Employee {
    private String name;
    private String street;
    private String city;
    private String zipCode;
    private String phoneNumber; // Formato "XXX-XXX-XXXX"
    private String email;       // Formato "user@domain.com"
    private int salaryAmount;   // Moneda en la que se paga no es explicita

    public Employee(String name, String street, String city, String zipCode, String phoneNumber, String email, int salaryAmount) {
        this.name = name;
        this.street = street;
        this.city = city;
        this.zipCode = zipCode;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.salaryAmount = salaryAmount;
    }
    // Getters y Setters

    /*
     *  La clase Employee utiliza tipos primitivos como String para representar conceptos complejos como direcciones, 
     * números de teléfono y correos electrónicos. También usa int para el salario sin indicar la moneda. 
     * Esto lleva a que la validación y el formato de estos datos se dispersen por el código donde se usan, 
     * en lugar de estar encapsulados dentro de sus propios objetos. La falta de objetos dedicados para 
        Address, PhoneNumber, Email o Money hace que la lógica de negocio relacionada con estos conceptos sea menos clara 
        y más propensa a errores
     */
}