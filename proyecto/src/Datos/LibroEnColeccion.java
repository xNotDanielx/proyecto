/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Datos;

import Datos.ILibroVentas;
import Entidades.articulos;
import java.util.ArrayList;
import java.util.Iterator;
import Entidades.ventas;

/**
 *
 * @author victo
 */
public class LibroEnColeccion implements ILibroVentas {
    private ArrayList<ventas> libro;
    
    public LibroEnColeccion(){
        this.libro = new ArrayList();
    }
    
    @Override
    public void registrarVenta(ventas a){
        this.libro.add(a);
    }
    
    @Override
    public ventas consultarVentaByPrecio(double p){
        ventas busqueda = null;
        for(ventas b: this.libro){
            if(b.getPrecio() == p){
                busqueda = b;
                break;
            }
        }
        return busqueda;
    }
    
    @Override
    public ventas informeVentas(){
        ventas busqueda = null;
        for (ventas b: this.libro){
            busqueda = b;
            System.out.println(busqueda);
        }
        return null;
    }
    
    @Override
    public ventas cancelarVenta(String n){
        Iterator<ventas> i = this.libro.iterator();
        ventas eliminada = null;
        while(i.hasNext()){
            ventas b = i.next();
            if(b.getArticulo().equals(n)){
                eliminada = b;
                i.remove();
                break;
            }
        }
        return eliminada;
    }

    public ArrayList<ventas> getLibro() {
        return libro;
    }

    public void setLibro(ArrayList<ventas> libro) {
        this.libro = libro;
    }
    
    
}
