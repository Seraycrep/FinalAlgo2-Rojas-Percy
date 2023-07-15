
package modelo;

import java.util.Date;

public class Cliente extends Persona {
    private int celular;
    private float dinero;

    public Cliente(int celular, float dinero, String nombre, String paterno, String materno, Date nacimiento, String numDocumento) {
        super(nombre, paterno, materno, nacimiento, numDocumento);
        this.celular = celular;
        this.dinero = dinero;
    }

    public int getCelular() {
        return celular;
    }

    public float getDinero() {
        return dinero;
    }

    public void setCelular(int celular) {
        this.celular = celular;
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
