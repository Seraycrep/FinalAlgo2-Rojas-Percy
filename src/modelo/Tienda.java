
package modelo;

public class Tienda {
    private String nombre;
    private String ruc;
    private String direccion;
    private Persona personas[];
    private int contClientes;
    private Cliente clientes[];
    private int contProductos;
    private Producto productos[];
    private int contCategorias;
    private Categoria categorias[];

    public Tienda(String nombre, String ruc, String direccion, Persona[] personas, Producto[] productos, Categoria[] categorias) {
        this.nombre = nombre;
        this.ruc = ruc;
        this.direccion = direccion;
        this.personas = personas;
        this.productos = new Producto[10];
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
        if(contClientes == clientes.length) {
            aumentarTamanoClientes();
        }
        
        clientes[contClientes] = c;
        contClientes++;
    }
    
    private void aumentarTamanoClientes() {
        int nuevoTamano = clientes.length * 2;
        Cliente[] nuevoClientes = new Cliente[nuevoTamano];
        for(int i=0; i< contClientes; i++) {
            nuevoClientes[i] = clientes[i];
        }
        
        clientes = nuevoClientes;
    }
    
    public void agregarCategoria(Categoria cat) {
        if(contCategorias == categorias.length) {
            aumentarTamanoCategorias();
        }
        
        categorias[contCategorias] = cat;
        contCategorias++;
    }
    
    public void aumentarTamanoCategorias() {
        int nuevoTamano = categorias.length * 2;
        Categoria[] nuevoCategorias = new Categoria[nuevoTamano];
        for(int i=0; i< contCategorias; i++) {
            nuevoCategorias[i] = categorias[i];
        }
        
        categorias = nuevoCategorias;
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
