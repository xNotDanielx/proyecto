/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Datos;

import Entidades.articulos;
import Entidades.ventas;

/**
 *
 * @author victo
 */
public interface ILibroVentas {
    void registrarVenta(ventas a);
    
    articulos consultarVentaByPrecio(double p);
    
    ventas cancelarVenta(String n);
    ventas informeVentas();
}
