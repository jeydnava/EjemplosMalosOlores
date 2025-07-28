package Couplers;

//Ejemplo de Feature Envy
public class Employee {
    private String name;
    private double hourlyRate;
    private double hoursWorked;

    public String getName() { return name; }
    public double getHourlyRate() { return hourlyRate; }
    public double getHoursWorked() { return hoursWorked; }
}

public class PayrollCalculator {
    public double calculateGrossPay(Employee employee) {
        // Este método está "envidiando" las características de la clase Employee
        // porque utiliza más los datos de Employee que sus propios datos
        return employee.getHourlyRate() * employee.getHoursWorked();
    }
}

/*
 *  El método calculateGrossPay en la clase PayrollCalculator necesita los datos hourlyRate y hoursWorked de la clase Employee para 
 * realizar su cálculo. Pasa más tiempo obteniendo y manipulando los datos de Employee que operando sobre sus propios datos 
 * (la clase PayrollCalculator no tiene datos de instancia propios relevantes para este cálculo). Esto indica que la lógica de cálculo 
 * del pago bruto probablemente pertenece a la clase Employee misma, ya que es la propietaria de los datos necesarios. 
 */