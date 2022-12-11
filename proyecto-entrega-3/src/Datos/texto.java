package Datos;


import java.io.*;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author victo
 */
public abstract class texto {
    protected File manejadorArchivo;
    protected FileWriter modoEscritura;
    protected Scanner modoLectura;

    public texto() {
    }
    
    public texto(String name) {
        this.manejadorArchivo = new File(name);
    }

    public File getManejadorArchivo() {
        return manejadorArchivo;
    }

    public void setManejadorArchivo(File manejadorArchivo) {
        this.manejadorArchivo = manejadorArchivo;
    }

    public FileWriter getModoEscritura() {
        return modoEscritura;
    }

    public void setModoEscritura(FileWriter modoEscritura) {
        this.modoEscritura = modoEscritura;
    }

    public Scanner getModoLectura() {
        return modoLectura;
    }

    public void setModoLectura(Scanner modoLectura) {
        this.modoLectura = modoLectura;
    }
    
    
}
