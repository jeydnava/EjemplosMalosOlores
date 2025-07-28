package ChangePreventers;

//Ejemplo de Divergent Change
public class Employee {
    private String name;
    private double salary;
    private String department;

    public void calculateBonus() {
        // Lógica para calcular el bono del empleado
        if (department.equals("Sales")) {
            // Bono específico para ventas
        } else {
            // Bono general
        }
    }

    public void generatePayrollReportEntry() {
        // Lógica para formatear la entrada del empleado en el informe de nómina
        // ... incluye detalles del salario, impuestos, etc.
    }

    public void saveToDatabase() {
        // Lógica para guardar la información del empleado en la base de datos
        // ... maneja la conexión, la SQL, etc.
    }
}

/*
 * La clase Employee tiene múltiples razones para cambiar. Si cambia la lógica de cálculo de bonos 
 * (ej., por nuevas políticas fiscales), hay que modificar calculateBonus(). Si cambia el formato del informe de nómina 
 * (ej., añadir un nuevo campo), hay que modificar generatePayrollReportEntry(). Si cambia el esquema de la base de datos o la tecnología 
 * de persistencia, hay que modificar saveToDatabase(). Esto significa que un solo cambio en los requisitos del sistema podría 
 * obligar a modificar esta única clase en diferentes secciones, lo que dificulta el mantenimiento y la evolución. 
 */
