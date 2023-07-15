
package modelo;

import java.util.Date;

public class Persona {
    private String nombre;
    private String paterno;
    private String materno;
    private Date nacimiento;
    private String numDocumento;

    public Persona(String nombre, String paterno, String materno, Date nacimiento, String numDocumento) {
        this.nombre = nombre;
        this.paterno = paterno;
        this.materno = materno;
        this.nacimiento = nacimiento;
        this.numDocumento = numDocumento;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPaterno() {
        return paterno;
    }

    public String getMaterno() {
        return materno;
    }

    public Date getNacimiento() {
        return nacimiento;
    }

    public String getNumDocumento() {
        return numDocumento;
    }

     
}
