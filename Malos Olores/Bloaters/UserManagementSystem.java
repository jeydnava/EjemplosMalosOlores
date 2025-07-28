package Bloaters;

import java.util.List;

//Ejemplo de Large Class
public class UserManagementSystem {
    // Atributos de usuario
    private String username;
    private String password;
    private String email;
    private List<String> roles;
    // ... más atributos de usuario

    // Métodos de gestión de usuario
    public void createUser(String username, String password, String email) { /* ... */ }
    public void deleteUser(String username) { /* ... */ }
    public void updateUserProfile(String username, String newEmail) { /* ... */ }
    public boolean authenticate(String username, String password) { /* ... */ return false;}
    public void assignRole(String username, String role) { /* ... */ }

    // Métodos de notificación
    public void sendWelcomeEmail(String email) { /* ... */ }
    public void sendPasswordResetEmail(String email) { /* ... */ }
    public void sendAccountDeletionNotification(String email) { /* ... */ }

    // Métodos de reporte
    public List<String> generateUserActivityReport() { /* ... */ return null; }
    public List<String> generateRoleAssignmentReport() { /* ... */ return null;}

    // Métodos de persistencia
    public void saveUserToDatabase(User user) { /* ... */ }
    public User loadUserFromDatabase(String username) { /* ... */ return null; }
    public void closeDatabaseConnection() { /* ... */ }

    // ... y muchos otros métodos relacionados con seguridad, auditoría, UI, etc.
    /*
     *  La clase UserManagementSystem acumula una gran cantidad de responsabilidades. No solo gestiona las operaciones Crear, Leer, 
     * Actualizar, Borrar de usuarios y la autenticación, sino que también se encarga de enviar correos electrónicos de notificación, 
     * generar informes y manejar la persistencia en la base de datos. Esta clase es "grande" porque hace demasiadas cosas, 
     * lo que dificulta su mantenimiento y la hace propensa a errores cuando se introduce un cambio, 
     * ya que cualquier modificación en una de sus muchas responsabilidades podría afectar a otras. 
     */
}
