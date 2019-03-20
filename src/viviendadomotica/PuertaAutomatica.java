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
public class PuertaAutomatica {
    
    private boolean estado;
    private int retardo; //segundos
    
    //java crea un constructor por defecto, si no implementamos ninguno

    public void cerrarPuerta(){
        if (estado) {
            estado = false;
        }        
    }
    
    public void abrirPuerta(){
        if (!estado) {
            estado = true;
        }        
    }
    
    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public int getRetardo() {
        return retardo;
    }

    public void setRetardo(int retardo) {
        this.retardo = retardo;
    }

    @Override
    public String toString() {
        return "PuertaAutomatica{" + "estado=" + estado + ", retardo=" + retardo + '}';
    } 
 
}