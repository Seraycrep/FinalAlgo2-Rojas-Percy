
package modelo;

public class Categoria {
    private String nombre;
    private boolean disponible;

    public Categoria(String nombre, boolean disponible) {
        this.nombre = nombre;
        this.disponible = disponible;
    }

    public String getNombre() {
        return nombre;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
    
    public boolean habilitar() {
        return false;
    }
    
    public boolean deshabilitar() {
        return false;
    }
}
