
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.Tienda;
import vista.frmProductos;

public class ControladorProductos {
    Tienda modelo;
    frmProductos vista;

    public ControladorProductos(Tienda modelo, frmProductos vista) {
        this.modelo = modelo;
        this.vista = vista;
        
        this.vista.btnAgregar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                float precio = Float.parseFloat(vista.fldPrecio.getText());
                String nombre = vista.fldNombre.getText();
                int stock = Integer.parseInt(vista.fldStock.getText());
                String marca = vista.fldMarca.getText();
                
            }
        });
    }
    
    
}
