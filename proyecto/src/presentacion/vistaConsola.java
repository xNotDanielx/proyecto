/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package presentacion;

import Entidades.*;
import Datos.*;
import modelo.app;

/**
 *
 * @author victo
 */
public class vistaConsola {
    private app articulo;
    private String menuGeneral[] = {"1. Ver articulos",
        "2. Vender articulo(s)",
        "3. comprar articulo(s)",
        "4. Consulta de ventas por precio",
        "5. Cancelacion de venta",
        "0. Salir"};
    private int opcMenuGeneral, opcMenuAhorro, opcMenuCheque;
    
    public vistaConsola(){
        this.articulo = new app();
    }
    
    private void vistaVenderArticulo(){
        ventas articulo;
        pantalla.tituloVista(this.menuGeneral[this.opcMenuGeneral - 1]);
        String nombre = Teclado.leerString("Nombre del articulo");
        String desc = Teclado.leerString("Descripcion del articulo");
        double precio = Teclado.leerDouble("Precio");
        articulo = new ventas(nombre, desc, precio);
        if (pantalla.msgConfirmacion() == 1) {
            this.articulo.registrarVenta(articulo);
            pantalla.msgExito();
        }
    }
    
    private void vistaConsultarVentaByNombre(){
        articulos buscar;
        pantalla.tituloVista(this.menuGeneral[this.opcMenuGeneral]);
        double precio = Teclado.leerDouble("Precio del articulo: ");
        buscar = this.articulo.consultarVentaByPrecio(precio);
        if (articulo != null){
            pantalla.imprimirVentas(buscar);
        } else{
            pantalla.msgNoEncontrada();
        }
    }
    
    private void vistaCancelarVenta(){
        ventas venta;
        pantalla.tituloVista(this.menuGeneral[this.opcMenuGeneral - 1]);
        String nombre = Teclado.leerString("articulo");
        venta = this.articulo.cancelarVenta(nombre);
        if(venta != null){
            pantalla.msgExito();
            pantalla.imprimirVentas(venta);
            pantalla.printTexto("Venta eliminada\n", "*");            
        } else{
            pantalla.msgNoEncontrada();
        }
    }
    
    private void vistaInformeVentas(){
        articulos articulo;
        pantalla.tituloVista(this.menuGeneral[this.opcMenuGeneral - 1]);
        articulo = this.articulo.informeVentas();
        if(articulo != null){
            pantalla.imprimirVentas(articulo);
        }
    }
    
    private void vistaSalir() {
        pantalla.tituloVista("** Fin de la ejecucion del programa **");
    }
    
    public void menuGeneral(){
        do
        {
            this.opcMenuGeneral = pantalla.imprimirMenu("Menú General", this.menuGeneral);
            switch(this.opcMenuGeneral){
                case 1:
                    this.vistaInformeVentas();
                    break;
                
                case 2:
                    this.vistaVenderArticulo();
                    break;
                  
                case 4:
                    this.vistaConsultarVentaByNombre();
                    break;
                    
                case 5:
                    this.vistaCancelarVenta();
                    
                case 0:
                    this.vistaSalir();
            }
        }while(this.opcMenuGeneral != 0);
    }
    
    
}
