/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Datos;

import Entidades.articulos;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author victo
 */
public interface ILibroArticulo {
    void registrarVenta(articulos a)throws IOException;
    ArrayList<articulos> consultarArticulo() throws IOException;
    ArrayList<articulos> leerVentas()throws IOException;
}
