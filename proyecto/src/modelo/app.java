/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import Entidades.ventas;
import Datos.*;
import Entidades.articulos;

/**
 *
 * @author victo
 */
public class app {
    private ILibroVentas libroElectronico;
    
    public app(){
        this.libroElectronico = new LibroEnColeccion();
    }
    
    public void registrarVenta(ventas a){
        this.libroElectronico.registrarVenta(a);
    }
    public articulos consultarVentaByPrecio(double p){
        return this.libroElectronico.consultarVentaByPrecio(p);
    }
    public ventas cancelarVenta(String n){
        return this.libroElectronico.cancelarVenta(n);
    }

    public ILibroVentas getLibroElectronico() {
        return libroElectronico;
    }
    public ventas informeVentas(){
        return this.libroElectronico.informeVentas();
    }

    public void setLibroElectronico(ILibroVentas libroElectronico) {
        this.libroElectronico = libroElectronico;
    }
    
    
}
