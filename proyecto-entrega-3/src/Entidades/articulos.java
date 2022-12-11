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
public class articulos {
    private String articulo;
    private String descripcion;
    private String precio;
    private String nombreVendedor;

    public articulos() {
    }

    public articulos(String articulo, String descripcion, String precio, String nombreVendedor) {
        this.articulo = articulo;
        this.descripcion = descripcion;
        this.precio = precio;
        this.nombreVendedor = nombreVendedor;
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

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getNombreVendedor() {
        return nombreVendedor;
    }

    public void setNombreVendedor(String nombreVendedor) {
        this.nombreVendedor = nombreVendedor;
    }
    
    

//        public String consultarDatos(){
//            String datos = String.format("%10s\t%10s\t%d", 
//                    this.articulo,
//                    this.descripcion,
//                    this.precio);
//
//            return datos;
//        }

    @Override
    public String toString() {
        return "articulos{" + "articulo=" + articulo + ", descripcion=" + descripcion + ", precio=" + precio + ", nombreVendedor=" + nombreVendedor + '}';
    }
    
    
}
