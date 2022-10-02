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
public class ventas {
    private String articuloV;
    private String descripcionV;
    private double precioV;
    

    public ventas(String articuloV, String descripcionV, double precioV) {
        this.articuloV = articuloV;
        this.descripcionV = descripcionV;
        this.precioV = precioV;
    }

    public String getArticuloV() {
        return articuloV;
    }

    public void setArticuloV(String articuloV) {
        this.articuloV = articuloV;
    }

    public String getDescripcionV() {
        return descripcionV;
    }

    public void setDescripcionV(String descripcionV) {
        this.descripcionV = descripcionV;
    }

    public double getPrecioV() {
        return precioV;
    }

    public void setPrecioV(double precioV) {
        this.precioV = precioV;
    }
    
    
}
