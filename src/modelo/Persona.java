
package modelo;

public class Persona {
    private String nombre;
    private float dinero;

    public Persona(String nombre, float dinero) {
        this.nombre = nombre;
        this.dinero = dinero;
    }

    public String getNombre() {
        return nombre;
    }

    public float getDinero() {
        return dinero;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDinero(float dinero) {
        this.dinero = dinero;
    }
    
    public boolean pagar() {
        
        return false;   
    }
    
    public boolean recargarDinero() {
        return false;
    }
}
