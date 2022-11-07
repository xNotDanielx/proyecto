/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import javax.swing.*;

/**
 *
 * @author victo
 */
public abstract class articulos {
    private String articulo;
    private String descripcion;
    private double precio;

    public articulos() {
    }

    public articulos(String articulo, String descripcion, double precio) {
        this.articulo = articulo;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    public String getArticulo() {
        return articulo;
    }

    public void setArticulo(String articulo) {
        this.articulo = articulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /*public void agregarArticulo(){
        this.articulo = JOptionPane.showInputDialog(null, "Nombre del articulo:");
        this.articulo = JOptionPane.showInputDialog(null, "Descripcion del articulo:");
        String preciot = JOptionPane.showInputDialog(null, "Precio:");
        this.precio = Double.parseDouble(preciot);
        System.out.println("Datos guardados exitosamente");
    }*/
    
    public String consultarDatos(){
        String datos = String.format("%10s\t%10s\t%d", 
                this.articulo,
                this.descripcion,
                this.precio);
        
        return datos;
    }
    
    
}
