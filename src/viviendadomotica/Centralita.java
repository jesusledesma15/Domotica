/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viviendadomotica;

import java.time.LocalDate;

/**
 *
 * @author Jesus
 */
public class Centralita {
    
    private static Garaje garaje;
    private static Salon salon;
    private static Dormitorio dormitorio;
    private static Usuario user;
    private static LocalDate fechaInstalacion;
    
    private String id;   

    public Centralita() {
        garaje = new Garaje();
        salon = new Salon();
        dormitorio = new Dormitorio();
        user = new Usuario("Jesus", "123J");
        fechaInstalacion = fechaInstalacion;
        id = id;
    }
    
    public boolean comprobarUsuario(Usuario aux){
        
        return user.equals(aux);
    }

    public Garaje getGaraje() {
        return garaje;
    }

    public void setGaraje(Garaje garaje) {
        garaje = garaje;
    }

    public Salon getSalon() {
        return salon;
    }

    public void setSalon(Salon salon) {
        salon = salon;
    }

    public Dormitorio getDormitorio() {
        return dormitorio;
    }

    public void setDormitorio(Dormitorio dormitorio) {
        dormitorio = dormitorio;
    }

    public Usuario getUser() {
        return user;
    }

    public void setUser(Usuario user) {
        user = user;
    }

    public LocalDate getFechaInstalacion() {
        return fechaInstalacion;
    }

    public void setFechaInstalacion(LocalDate fechaInstalacion) {
        fechaInstalacion = fechaInstalacion;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        id = id;
    }

    @Override
    public String toString() {
        return "Centralita{" + "garaje=" + garaje + ", salon=" + salon + ", dormitorio=" + dormitorio + ", user=" + user + ", fechaInstalacion=" + fechaInstalacion + ", id=" + id + '}';
    }
    
    
    
}