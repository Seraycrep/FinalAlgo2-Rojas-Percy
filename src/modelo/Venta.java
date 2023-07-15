
package modelo;

import java.util.Date;

public class Venta {
    private float total;
    private Date fecha;
    private boolean estado;
    private Trabajador trabajador;
    private Cliente cliente;
    private int contDetalles;
    private Detalle detalles[];
    private static final int CAPACIDAD_INICIAL = 10;

    public Venta(float total, Date fecha, boolean estado, Trabajador trabajador, Cliente cliente, Detalle[] detalles) {
        this.total = total;
        this.fecha = fecha;
        this.estado = estado;
        this.trabajador = trabajador;
        this.cliente = cliente;
        this.detalles = new Detalle[CAPACIDAD_INICIAL];
        this.contDetalles = 0;
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
        float precio = p.getPrecio();
        float total = precio * cantidad * (1-descuento);
        Detalle detalle = new Detalle(cantidad, precio, descuento, total, p);
        detalles[contDetalles] = detalle;
        contDetalles++;
    }
    
    public boolean eliminarProducto(Producto p, int cantidad) {
        int indice = encontrarIndiceProducto(p);
        if(indice != -1) {
            Detalle detalle = detalles[indice];
            int cantidadActual = detalle.getCantidad();
            
            if(cantidadActual <= cantidad) {
                for(int i=indice; i < contDetalles-1; i++) {
                    detalles[i] = detalles[i+1];
                }
                detalles[contDetalles-1] = null;
                contDetalles--;
                return true;
            }
            else {
                detalle.setCantidad(cantidadActual-cantidad);
                return true;
            }
        }
        return false;
    }
    
    private int encontrarIndiceProducto(Producto p) {
        for(int i=0; i < contDetalles; i++) {
            if(detalles[i].getProducto().equals(p)) {
                return i;
            }
        }
        
        return -1;
    }
    
    public float validarCarrito() {
        float precioTotal = 0.0f;
        for(int i=0; i < contDetalles; i++) {
            Detalle detalle = detalles[i];
            precioTotal += detalle.getTotal();
        }
        return precioTotal;  
    }
}
