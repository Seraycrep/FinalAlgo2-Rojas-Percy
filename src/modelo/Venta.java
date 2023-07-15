
package modelo;

import java.util.Date;

public class Venta {
    private float total;
    private Date fecha;
    private boolean estado;
    private Trabajador trabajador;
    private Cliente cliente;
    private Detalle detalles[];

    public Venta(float total, Date fecha, boolean estado, Trabajador trabajador, Cliente cliente, Detalle[] detalles) {
        this.total = total;
        this.fecha = fecha;
        this.estado = estado;
        this.trabajador = trabajador;
        this.cliente = cliente;
        this.detalles = detalles;
    }

    public float getTotal() {
        return total;
    }

    public Date getFecha() {
        return fecha;
    }

    public boolean isEstado() {
        return estado;
    }

    public Trabajador getTrabajador() {
        return trabajador;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Detalle[] getDetalles() {
        return detalles;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public void setTrabajador(Trabajador trabajador) {
        this.trabajador = trabajador;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setDetalles(Detalle[] detalles) {
        this.detalles = detalles;
    }
    
    public void agregarProducto(Producto p, int cantidad, float descuento) {
        //Detalle detalle = new Detalle(cantidad, p.getPrecio(), descuento, this);
    }
    
    public boolean eliminarProducto(Producto p, int cantidad) {
        return false;
    }
    
    public float validarCarrito() {
        
        return 0;  
    }
}
