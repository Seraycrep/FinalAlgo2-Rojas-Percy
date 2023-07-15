
package modelo;

public class Detalle {
    private int cantidad;
    private float precio;
    private float descuento;
    private float total;
    private Producto producto;

    public Detalle(int cantidad, float precio, float descuento, float total, Producto producto) {
        this.cantidad = cantidad;
        this.precio = precio;
        this.descuento = descuento;
        this.total = total;
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public float getPrecio() {
        return precio;
    }

    public float getDescuento() {
        return descuento;
    }

    public float getTotal() {
        return total;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public void setDescuento(float descuento) {
        this.descuento = descuento;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }
    
    
}
