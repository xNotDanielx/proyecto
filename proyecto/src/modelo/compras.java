/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author juan2
 */
public class compras {
    private String articuloC;
    private String descripcionC;
    private double precioC;
    ventas a;

    public compras(String articuloC, String descripcionC, double precioC) {
        this.articuloC = articuloC;
        this.descripcionC = descripcionC;
        this.precioC = precioC;
    }

    public String getArticuloC() {
        return articuloC;
    }

    public void setArticuloC(String articuloC) {
        this.articuloC = articuloC;
    }

    public String getDescripcionC() {
        return descripcionC;
    }

    public void setDescripcionC(String descripcionC) {
        this.descripcionC = descripcionC;
    }

    public double getPrecioC() {
        return precioC;
    }

    public void setPrecioC(double precioC) {
        this.precioC = precioC;
    }
    
    
}
