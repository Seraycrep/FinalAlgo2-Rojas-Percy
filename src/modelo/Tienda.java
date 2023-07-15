
package modelo;

public class Tienda {
    private String nombre;
    private String ruc;
    private String direccion;
    private Persona personas[];
    private int contProductos;
    private Producto productos[];
    private Categoria categorias[];

    public Tienda(String nombre, String ruc, String direccion, Persona[] personas, Producto[] productos, Categoria[] categorias) {
        this.nombre = nombre;
        this.ruc = ruc;
        this.direccion = direccion;
        this.personas = personas;
        this.productos = productos;
        this.categorias = categorias;
    }

    public String getNombre() {
        return nombre;
    }

    public String getRuc() {
        return ruc;
    }

    public String getDireccion() {
        return direccion;
    }

    public Persona[] getPersonas() {
        return personas;
    }

    public Producto[] getProductos() {
        return productos;
    }

    public Categoria[] getCategorias() {
        return categorias;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void agregarCliente(Cliente c) {
        
    }
    
    public void agregarCategoria(Categoria cat) {
        
    }
    
    public void agregarProducto(Producto p) {
        if(contProductos == productos.length) {
            aumentarTamanoProductos();
        }
        
        productos[contProductos] = p;
        contProductos++;
    }
    
    private void aumentarTamanoProductos() {
        int nuevoTamano = productos.length * 2;
        Producto[] nuevoProductos = new Producto[nuevoTamano];
        for(int i=0; i< contProductos; i++) {
            nuevoProductos[i] = productos[i];
        }
        
        productos = nuevoProductos;
    }
    
    public Producto[] buscarProductosPorCategoria(Categoria cat) {
        
        return null;    
    }
    
    public Producto[] buscarProductosPorNombre(String nombre) {
        
        return null;    
    }
    
    public Persona autenticar(String email, String password) {
        
        return null;  
    }
    
}
