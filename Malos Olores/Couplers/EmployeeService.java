package Couplers;

//Ejemplo de Middle Man
public class EmployeeService {
    private EmployeeRepository repository;

    public EmployeeService(EmployeeRepository repository) {
        this.repository = repository;
    }

    public Employee getEmployeeById(String id) {
        // Solo reenvía la llamada
        return repository.findById(id);
    }

    public void saveEmployee(Employee employee) {
        // Solo reenvía la llamada
        repository.save(employee);
    }
    // ... y muchos otros métodos que solo llaman a métodos correspondientes en repository
}

public class EmployeeRepository {
    public Employee findById(String id) { /* ... */ return null; }
    public void save(Employee employee) { /* ... */ }
}

/*
 * La clase EmployeeService actúa como un "hombre del medio" o intermediario. Sus métodos (getEmployeeById, saveEmployee) 
 * simplemente reenvían las llamadas directamente a los métodos correspondientes de EmployeeRepository sin añadir ninguna 
 * lógica de negocio, validación, transformación o valor adicional. Esta clase es redundante, ya que los clientes podrían interactuar 
 * directamente con EmployeeRepository. Su existencia solo añade una capa de complejidad innecesaria sin un propósito claro, lo que 
 * dificulta la navegación del código y el mantenimiento. 
 */