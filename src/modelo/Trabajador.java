
package modelo;

import java.util.Date;

public class Trabajador extends Persona {
    private String password;
    private String email;

    public Trabajador(String password, String email, String nombre, String paterno, String materno, Date nacimiento, String numDocumento) {
        super(nombre, paterno, materno, nacimiento, numDocumento);
        this.password = password;
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public boolean ingresar(String email, String password) {
        return false;
    }
    
    public boolean salir() {
        return false;
    }
    
    public boolean crearVenta(Cliente c) {
        return false;
    }
}
