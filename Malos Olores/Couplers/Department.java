package Couplers;

//Ejemplo de Message Chains
public class Department {
    private Manager manager;
    public Manager getManager() { return manager; }
}

public class Manager {
    private Team team;
    public Team getTeam() { return team; }
}

public class Team {
    private Lead lead;
    public Lead getLead() { return lead; }
}

public class Lead {
    private String leadName;
    public String getLeadName() { return leadName; }
}

public class OrganizationalStructure {
    public String getTeamLeadName(Department department) {
        // Cadena de mensajes: department.getManager().getTeam().getLead().getLeadName()
        return department.getManager().getTeam().getLead().getLeadName();
    }
}

/*
 * El método getTeamLeadName en OrganizationalStructure utiliza una serie de llamadas a métodos 
 * (department.getManager().getTeam().getLead().getLeadName()) para obtener el nombre del líder del equipo. 
 * Esta "cadena de mensajes" expone la estructura interna de cómo están relacionados los objetos Department, Manager, Team y Lead. 
 * Si la estructura organizacional cambia (por ejemplo, Team ya no tiene un Lead directo, o hay una capa intermedia), 
 * esta línea de código se romperá, lo que hace que el sistema sea frágil y rígidamente acoplado a una implementación particular. 
 */