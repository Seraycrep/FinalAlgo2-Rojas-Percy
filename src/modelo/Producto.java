
package modelo;

public class Producto {
    private float precio;
    private String nombre;
    private int stock;
    private String marca;
    private Categoria categoria;

    public Producto(float precio, String nombre, int stock, String marca, Categoria categoria) {
        this.precio = precio;
        this.nombre = nombre;
        this.stock = stock;
        this.marca = marca;
        this.categoria = categoria;
    }

    public float getPrecio() {
        return precio;
    }

    public String getNombre() {
        return nombre;
    }

    public int getStock() {
        return stock;
    }

    public String getMarca() {
        return marca;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    public boolean vender(int cantidad) {
        return false;
    }
    
    public boolean reponer(int cantidad) {
        return false;
    }
}
