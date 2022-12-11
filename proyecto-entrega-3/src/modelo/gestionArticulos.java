

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import Datos.ILibroArticulo;
import Datos.LibroEnColeccion;
import Entidades.articulos;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author victo
 */
public class gestionArticulos {
    private ILibroArticulo archivo;

    public gestionArticulos() {
        this.archivo = new LibroEnColeccion();
    }
    
    public void registrarVenta(articulos v)throws IOException{
        this.archivo. registrarVenta(v);
    }
    
    public ArrayList<articulos> leerVentas() throws IOException {
        return this.archivo.leerVentas();  
    }
    public ArrayList<articulos> consultarArticulo() throws IOException {
        return this.archivo.consultarArticulo();
    }
}
