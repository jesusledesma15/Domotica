/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viviendadomotica;

/**
 *
 * @author salva
 */
class Persiana {

    private int estado;
    private int largo, ancho; //cm

    public Persiana(int estado, int largo, int ancho) {
        this.estado = estado;
        this.largo = largo;
        this.ancho = ancho;
    }
    
        public void mediaPersiana(){
         if (this.estado != 2) {
             this.estado = 2;            
        }
    }
    
        public void bajarPersiana(){
         if (this.estado != 0) {
             this.estado = 0;            
        }
    }
    
    public void subirPersiana(){
         if (this.estado != 1) {
             this.estado = 1;            
        }
    }

    public Persiana() {
    }

    public int isEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public int getLargo() {
        return largo;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    @Override
    public String toString() {
        return "Persiana{" + "estado=" + estado + ", largo=" + largo + ", ancho=" + ancho + '}';
    }

}