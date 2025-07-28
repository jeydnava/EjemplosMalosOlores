package ChangePreventers;
//Ejemplo de Parallel Inheritance Hierarchies
// Jerarquía de tipos de Empleado
public abstract class EmployeeType {
    public abstract double getBaseSalaryFactor();
}

public class FullTimeEmployeeType extends EmployeeType {
    @Override
    public double getBaseSalaryFactor() { return 1.0; }
}

public class PartTimeEmployeeType extends EmployeeType {
    @Override
    public double getBaseSalaryFactor() { return 0.5; }
}

// Jerarquía de procesadores de Nómina, paralela a la de Empleado
public abstract class PayrollProcessor {
    public abstract double calculateGrossPay(double baseAmount);
}

public class FullTimePayrollProcessor extends PayrollProcessor {
    @Override
    public double calculateGrossPay(double baseAmount) { return baseAmount * 1.0; } // Sin deducciones adicionales
}

public class PartTimePayrollProcessor extends PayrollProcessor {
    @Override
    public double calculateGrossPay(double baseAmount) { return baseAmount * 0.9; } // Deducción del 10%
}

/*
 * Existe un acoplamiento estrecho entre las jerarquías de EmployeeType y PayrollProcessor. 
 * Cada vez que se añade un nuevo tipo de empleado (por ejemplo, ContractorEmployeeType), se debe crear una subclase correspondiente 
 * en la jerarquía de PayrollProcessor (ej., ContractorPayrollProcessor). Esto significa que un solo cambio conceptual 
 * (añadir un tipo de empleado) requiere modificar dos jerarquías de herencia en paralelo, lo que aumenta la complejidad y el esfuerzo 
 * de mantenimiento.
 */