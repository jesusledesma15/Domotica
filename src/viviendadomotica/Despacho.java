/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.viviendadomotica;

/**
 *
 * @author Jesus
 */
public class Despacho  extends Habitacion{
    private int impresoras;
    private String color;

    public Despacho(int impresoras, String color, Luz luz, Persiana persiana, Camara camara, int m2) {
        super(luz, persiana, camara, m2);
        this.impresoras = impresoras;
        this.color = color;
    }

    public Despacho() {
        this.impresoras = 2;
        this.color = "Blanco";
    }

    public int getImpresoras() {
        return impresoras;
    }

    public void setImpresoras(int impresoras) {
        this.impresoras = impresoras;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Despacho{" + "impresoras=" + impresoras + ", color=" + color + '}';
    }
    
    
}
