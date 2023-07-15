
package modelo;

public class VentaArreglo {
    private int indice;
    private Venta ventas[];

    public VentaArreglo(int indice, Venta[] ventas) {
        this.indice = indice;
        this.ventas = ventas;
    }

    public int getIndice() {
        return indice;
    }

    public Venta[] getVentas() {
        return ventas;
    }

    public void setIndice(int indice) {
        this.indice = indice;
    }

    public void setVentas(Venta[] ventas) {
        this.ventas = ventas;
    }
    
    
}
