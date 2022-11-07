/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package presentacion;
import java.time.LocalDate;
import java.util.*;

/**
 *
 * @author victo
 */
public class Teclado {
    private static Scanner entrada = new Scanner(System.in);
    
    public static int leerInt(String dato){
        pantalla.printTexto(dato);
        return entrada.nextInt();
    }
    public static int leerInt(String dato, String marcador){
        pantalla.printTexto(dato, marcador);
        return entrada.nextInt();
    }
    
    public static double leerDouble(String dato){
        pantalla.printTexto(dato);
        return entrada.nextDouble();
    }
    
    public static String leerLinea(String dato){
        pantalla.printTexto(dato);
        entrada = new Scanner(System.in);
        return entrada.nextLine();
    }
    
    public static String leerString(String dato){
        pantalla.printTexto(dato);
        entrada = new Scanner(System.in);
        return entrada.nextLine();
    }
    
    
    
    public static LocalDate leerFecha(String titulo) {
        System.out.println(titulo);
        int dia = Teclado.leerInt("  Dia[dd] ");
        int mes = Teclado.leerInt("  Mes[mm] ");
        int año = Teclado.leerInt("  Año[aaaa] ");
        return LocalDate.of(año, mes, dia);
    }
    
}
