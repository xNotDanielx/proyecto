/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package presentacion;

import Entidades.articulos;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import modelo.gestionArticulos;

/**
 *
 * @author victo
 */
public class GuiConsultarVentas extends JDialog{
    private Container contenedor;
    
    private JPanel panelBusqueda, panelPpal, panelLogo;
    private JScrollPane panelResultado;
    
    private RowSorter ordenadorTabla;
    
    private JLabel lbBusqueda, lbLogo;
    private JComboBox cmbBusqueda;
    private JTable tabla;
    private JButton boton;
    
    private DefaultTableModel modeloTabla;
    private String titulos[] = {"Articulo", "Descripcion", "Precio", "Proveedor"};
    private String contenido[][]={null,null};

    private gestionArticulos modeloven;

    public GuiConsultarVentas(Frame owner, boolean modal) {
        super(owner, modal);
        this.modeloven = new gestionArticulos();
        this.setTitle("Consulta de Ventas actuales");
        this.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        this.iniciarComponentes();
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
    
    public void iniciarComponentes(){
        this.contenedor = this.getContentPane();     
        this.panelPpal = new JPanel(new BorderLayout());
        this.panelPpal.setBorder(BorderFactory.createEmptyBorder(30, 30, 30, 30));
        this.setLayout(new BorderLayout());
//        this.iniciarPanelBusqueda();
        this.iniciarPenalResultado();
//        this.iniciarPanelLogo();
        this.contenedor.add(this.panelPpal);
//        this.cargarVentas();
    }
    
//    public void iniciarPanelLogo(){
//        this.panelLogo = new JPanel();
//        this.panelLogo.setBorder(BorderFactory.createTitledBorder("Logotipo"));
//        ImageIcon image = new ImageIcon("./src/imagenes/not-image.jpeg");
//        this.lbLogo = new JLabel(image);
//        this.panelLogo.add(this.lbLogo);
//        this.panelPpal.add(this.panelLogo, BorderLayout.EAST);
//        
//    }
    
    public void iniciarPenalResultado(){
        
        this.panelResultado = new JScrollPane();
        this.panelResultado.setBorder(BorderFactory.createTitledBorder("Resultados de busqueda"));
        this.tabla = new JTable();
        this.modeloTabla= new DefaultTableModel(this.contenido, this.titulos);
        this.tabla.setModel(this.modeloTabla);
        
        //permite que la tabla ordene sus valores segun la columna a la que se da click
        this.ordenadorTabla = new TableRowSorter(this.modeloTabla);
        this.tabla.setRowSorter(ordenadorTabla);
        
        this.panelResultado.setViewportView(this.tabla);
        
        this.panelPpal.add(this.panelResultado);
        
    }
    
    public void buscarSelecciones() throws IOException{
        ArrayList<articulos> lista = this.modeloven.consultarArticulo();
        String matriz[][]=new String[lista.size()][];
        int filas=0;
        for(articulos s: lista){
            
            String registro[]={String.valueOf(s.getArticulo()), s.getDescripcion(), ""+s.getPrecio(), s.getNombreVendedor()};
            matriz[filas]=registro;
            filas++;
        }
        this.modeloTabla.setDataVector(matriz, this.titulos);
        
        
    }
    
    class EventoClickBusqueda implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            try {  
                buscarSelecciones();
            } catch (IOException ex) {
                 JOptionPane.showMessageDialog(null, ex, "Error de archivo", JOptionPane.ERROR_MESSAGE);
            }
        }
    
    }
}
