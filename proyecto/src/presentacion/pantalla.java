/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package presentacion;

import Entidades.*;
import java.util.ArrayList;

/**
 *
 * @author victo
 */
public class pantalla {
    public static int imprimirMenu(String titulo, String opciones[]){
        pantalla.tituloVista(titulo);
        for(int i=0; i<opciones.length; i++){
            System.out.printf("| %-35s |%n", opciones[i]);    
        }
        System.out.println("-----------------------------------------");
        int opc = Teclado.leerInt("seleccione una opcion: ");
        return opc;
    }
    
    public static void imprimirVentas(ArrayList<articulos> ventas){
        System.out.println("-------------------------------------------------");
        System.out.printf("%10s\t%10s\t%10s%n",
                          "Nombre del articulo", 
                          "Nombre cliente", 
                          "Saldo");
        System.out.println("-------------------------------------------------");
        for(articulos c: ventas){
            System.out.println("| "+c.consultarDatos()+" |");
        }
        System.out.println("-------------------------------------------------");
    }
    
    public static void imprimirVentas(articulos venta){
        System.out.println("-------------------------------------------------");
        System.out.printf("%10s\t%10s\t%10s\t%10s\t%10s\t%10s%n",
                          "No cuenta", 
                          "Nombre cliente", 
                          "Saldo","Fecha Venc", 
                          "% Interes",
                          "% Comision");
        System.out.println("-------------------------------------------------");
        System.out.println("| "+venta.consultarDatos()+" |");
        System.out.println("-------------------------------------------------");
    }
    
    //public static void imprimirVentas
    public static void tituloVista(String titulo){
        System.out.println("\n-----------------------------------------");
        System.out.printf("| %-35s |%n", titulo.toUpperCase());
        System.out.println("-------------------------------------------");
    }
    
    public static void msgExito(){
        System.out.println("Articulo registrado con exito!");      
    }
    
    public static void msgNoEncontrada(){
        System.out.println("El articulo no se ha podido registrar... Lo sentmos :(");        
    }
    
    public static int msgConfirmacion(){
        int opc;
        do{
            opc = Teclado.leerInt("¿Desea confirmar ? [1->si] [2->no]","");
        }while(opc != 1 && opc != 2);
        return opc;
    }
    
    public static void printTexto(String dato){
        System.out.printf("%s %-15s:",">>",dato);
    }
    
    public static void printTexto(String dato, String marcador){
        System.out.printf("%s %-15s:",marcador,dato);
    }
}
