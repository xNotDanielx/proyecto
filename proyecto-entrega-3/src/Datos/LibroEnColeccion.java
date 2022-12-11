/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Datos;

import Entidades.articulos;
import java.util.*;
import java.io.*;

/**
 *
 * @author victo
 */
public class LibroEnColeccion extends texto implements ILibroArticulo {

    public LibroEnColeccion(){
        this("Articulos.dat");
    }
    
    public LibroEnColeccion(String name) {
        this.manejadorArchivo = new File(name);
    }

    @Override
    public void registrarVenta(articulos a) throws IOException {
        PrintWriter pw = null;
        try {
            this.modoEscritura = new FileWriter(this.manejadorArchivo, true);
            pw = new PrintWriter(this.modoEscritura);
            pw.printf("%s;%s;%s;%s%n",
                    a.getArticulo(),
                    a.getDescripcion(),
                    a.getPrecio(),
                    a.getNombreVendedor());

        } catch (FileNotFoundException fne) {
            throw new IOException("Error al escribir en el archivo");
        } catch (IOException ioe) {
            throw new IOException("Error al abrir archvio en modo escritura");
        } catch (SecurityException se) {
            throw new IOException("No tiene privilegios para abrir el archivo");
        } finally {
            if (pw != null) {
                pw.close();
            }
        }
    }
    
    private articulos cargarVenta(String dato[])throws IOException{
        String articulo = dato[0];
        String descripcion= dato[1];
        String precio = dato[2].replace(',', '.');
        String nombreVendedor = dato[3];     
        articulos v = new articulos(articulo, descripcion, precio, nombreVendedor);
        return v;
    }

    @Override
    public ArrayList<articulos> consultarArticulo() throws IOException {
        ArrayList<articulos> buscadas = new ArrayList();
        try {
            this.modoLectura = new Scanner(this.manejadorArchivo);
            while (this.modoLectura.hasNext()) {
                String dato[] = this.modoLectura.nextLine().split(";");
                articulos s = this.cargarVenta(dato);
                buscadas.add(s);    
            }
           
            return buscadas;
            
        } catch (FileNotFoundException fne) {
            throw new IOException("Error al abrir archivo en modo lectura");
        } catch (SecurityException se) {
            throw new IOException("No tiene privilegios para leer el archivo");
        }
        finally{
            if(this.modoLectura!=null)
                this.modoLectura.close();
        }
    }

    @Override
    public ArrayList<articulos> leerVentas() throws IOException {
        ArrayList<articulos> lista = null;
        if(!this.manejadorArchivo.exists()){
           lista = new ArrayList();
           return lista;
        }
        try {
            this.modoLectura = new Scanner(this.manejadorArchivo);
            lista = new ArrayList();
            while (this.modoLectura.hasNext()) {
                String dato[] = this.modoLectura.nextLine().split(";");
                articulos v = this.cargarVenta(dato);
                lista.add(v);
            }
            return lista;
        } catch (FileNotFoundException fne) {
            throw new IOException("Error al abrir archivo en modo lectura");
        } catch (SecurityException se) {
            throw new IOException("No tiene privilegios para leer el archivo");
        }
        finally{
            if(this.modoLectura!=null)
                this.modoLectura.close();
        }
    }
    
    
}
