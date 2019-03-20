/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viviendadomotica;

import java.time.LocalTime;

/**
 *
 * @author salva
 */
public class Habitacion extends Estancia {

    private Luz luz;
    private Persiana persiana;
    private Camara camara;

    public Habitacion(Luz luz, Persiana persiana, Camara camara, int m2) {
        super(m2);
        this.luz = new Luz();
        this.persiana = new Persiana();
        this.camara = new Camara();
    }

    public Habitacion() {
        
    }
    
    
    public void apagarLuzGeneral(){
        luz.apagarLuz();        
    }

    public void apagadoEco(){
        LocalTime ahora = LocalTime.now();
        if (luz.isEstado() && ahora.getHour() < 18 && ahora.getHour() > 8) {
            luz.setEstado(false);
            System.out.println("Apagado ECO activado");
        }
        else{
            System.out.println("No es posible activar el apagado ECO");
        }
    }
    public Luz getLuz() {
        return luz;
    }
    

    public void setLuz(Luz luz) {
        this.luz = luz;
    }

    public Persiana getPersiana() {
        return persiana;
    }

    public void setPersiana(Persiana persiana) {
        this.persiana = persiana;
    }

    public Camara getCamara() {
        return camara;
    }

    public void setCamara(Camara camara) {
        this.camara = camara;
    }

    public String toString() {
        return super.toString()+"Habitacion{" + "luz=" + luz + ", persiana=" + persiana + ", camara=" + camara + '}';
    }

    

}