/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package presentacion;

import Entidades.articulos;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.*;
import modelo.gestionArticulos;

/**
 *
 * @author victo
 */
public class GuiRegistrarVenta extends JDialog implements ActionListener{

    private Container contenedor;
    private JPanel panelDatos, panelBotones;
    private JLabel lbArticulo, lbDescripcion, lbPrecio, lbProveedor;
    private JTextField txtArticulo, txtDescripcion, txtProveedor;
    private JTextField txtPrecio;
    private JButton btnGuardar, btnCancelar;
    private gestionArticulos modeloven;

    public GuiRegistrarVenta(Frame owner, boolean modal) {
        super(owner, modal);
        this.modeloven = new gestionArticulos();
        this.setTitle("Registro de ventas");
        this.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        this.inicializarComponenetes();
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);

    }

    public void inicializarComponenetes() {

        this.contenedor = this.getContentPane();
        this.contenedor.setLayout(new BorderLayout());
        this.crearPanelDatos();
        this.crearPanelBotones();
    }

    public void crearPanelDatos() {
        this.panelDatos = new JPanel(new GridLayout(5, 2, 5, 5));
        this.panelDatos.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        this.lbArticulo = new JLabel("Nombre del articulo: ");
        this.lbDescripcion = new JLabel("Descripcion: ");
        this.lbPrecio = new JLabel("Precio: ");
        this.lbProveedor = new JLabel("Nombre del proveedor: ");

        this.txtArticulo = new JTextField(15);
        this.txtDescripcion = new JTextField(0);        
        this.txtPrecio = new JTextField(0);     
        this.txtProveedor = new JTextField(0);

        this.panelDatos.add(this.lbArticulo);
        this.panelDatos.add(this.txtArticulo);

        this.panelDatos.add(this.lbDescripcion);
        this.panelDatos.add(this.txtDescripcion);

        this.panelDatos.add(this.lbPrecio);
        this.panelDatos.add(this.txtPrecio);

        this.panelDatos.add(this.lbProveedor);
        this.panelDatos.add(this.txtProveedor);

        this.contenedor.add(this.panelDatos, BorderLayout.CENTER);

    }

    public void crearPanelBotones() {

        this.panelBotones = new JPanel();
        this.panelBotones.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        this.btnGuardar = new JButton("Guardar");
        this.btnGuardar.addActionListener(this);
        this.btnCancelar = new JButton("Cancelar");
        this.btnCancelar.addActionListener(this);

        JPanel panel = new JPanel(new GridLayout(2, 1, 5, 5));
        panel.add(this.btnGuardar);
        panel.add(this.btnCancelar);

        this.panelBotones.add(panel);
        this.contenedor.add(this.panelBotones, BorderLayout.EAST);

    }

    private articulos leerDatos() throws IOException {

        String nombreArticulo = this.txtArticulo.getText();
        if (this.txtArticulo.getText().isBlank()) {
            throw new NullPointerException("EL nombre del articulo no puede ser vacio");
        }
        
        String Descripcion = this.txtDescripcion.getText();
        if (this.txtDescripcion.getText().isBlank()) {
            throw new NullPointerException("la descripcion no puede ser vacia");
        }
        
        String precio = this.txtPrecio.getText();
        if (this.txtPrecio.getText().isBlank()) {
            throw new NullPointerException("El Precio no puede ser vacio");
        }
        
        String Proveedor = this.txtProveedor.getText();
        if (this.txtProveedor.getText().isBlank()) {
            throw new NullPointerException("EL nombre del proveedor no puede ser vacio");
        }
                
        return new articulos( nombreArticulo, Descripcion, precio, Proveedor);
    }

    public void limpiarCampos() {
        this.txtArticulo.setText(null);
        this.txtDescripcion.setText(null);
        this.txtPrecio.setText(null);
        this.txtProveedor.setText(null);
        this.txtArticulo.grabFocus();
    }

    public void guardar() {

        try {
            articulos venta = this.leerDatos();
            this.modeloven.registrarVenta(venta);
            JOptionPane.showMessageDialog(this, "Datos guardados con exito", "Confirmacion", JOptionPane.INFORMATION_MESSAGE);
            this.limpiarCampos();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, ex, "Error de archivo", JOptionPane.ERROR_MESSAGE);
        } catch (NullPointerException ne) {
            JOptionPane.showMessageDialog(this, ne, "Error de validacion", JOptionPane.ERROR_MESSAGE);
        }

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == this.btnGuardar) {

            this.guardar();

        } else if (e.getSource() == this.btnCancelar) {

            this.limpiarCampos();
        }

    }
    
}
