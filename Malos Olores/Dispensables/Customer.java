package Dispensables;

//EJEMPLO DE DATA CLASS
public class Customer {
    public String name;
    public String email;
    public String address;
    public int loyaltyPoints; // Podría tener comportamiento asociado

    // Constructor
    public Customer(String name, String email, String address, int loyaltyPoints) {
        this.name = name;
        this.email = email;
        this.address = address;
        this.loyaltyPoints = loyaltyPoints;
    }

    // Getters y Setters públicos para todos los campos
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }
    public int getLoyaltyPoints() { return loyaltyPoints; }
    public void setLoyaltyPoints(int loyaltyPoints) { this.loyaltyPoints = loyaltyPoints; }
}

/*
 * La clase Customer está diseñada principalmente para almacenar datos. Tiene campos públicos o una gran cantidad de getters y setters, 
 * pero carece de métodos que encapsulen la lógica de negocio relacionada con esos datos (por ejemplo, addLoyaltyPoints(), isValidEmail(), 
 * updateAddress()). Esto significa que otras clases tendrán que manipular directamente los datos del Customer, llevando a la 
 * "envidia de función" y al código disperso que debería estar en la propia clase Customer.
 */