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
class Camara {
    
    private boolean estado;
    private String ip; //direccion ip de la camara

    public Camara(boolean estado, String ip) {
        this.estado = estado;
        this.ip = ip;
    }

    public Camara() {
        this.estado = false;
        this.ip = "192.168.1.122";
    }

    
    public void encenderCamara(){
         if (!this.estado) {
             this.estado = true;            
        }
    }
    
    public void apagarCamara(){
         if (this.estado) {
             this.estado = false;            
        }
    }
    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    @Override
    public String toString() {
        return "Camara{" + "estado=" + estado + ", ip=" + ip + '}';
    }
    
    
    
    
}