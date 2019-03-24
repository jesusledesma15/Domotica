/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domotica;

import java.time.LocalDate;
import java.time.LocalTime;
import viviendadomotica.Reloj;

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
    
   public void ejecutarOrden(viviendadomotica.Comando comando) {

        switch (comando) {

            case APAGAR_SISTEMA:

                break;
            case CONSULTAR_HORA:
                Reloj.getHora();
                break;
            case MODIFICAR_HORA:
                Reloj.setHora(LocalTime.NOON);
                break;
            case CONSULTAR_PUERTA_GARAJE:
                consutarPuertaGaraje();
                break;
            case ABRIR_PUERTA_GARAJE:
                abrirGaraje();
                break;
            case CERRAR_PUERTA_GARAJE:
                cerrarGaraje();
                break;
            case CONSULTAR_PERSIANA_SALON:
                consutarPersianaSalon();
                break;

            case SUBIR_PERSIANA_SALON:
                subirPersianaSalon();
                break;

            case BAJAR_PERSIANA_SALON:
                bajarPersianaSalon();
                break;

            case CONSULTAR_LUZ_SALON:
                consutarLuzSalon();
                break;

            case ENCENDER_LUZ_SALON:
                encenderLuzSalon();
                break;

            case APAGAR_LUZ_SALON:
                apagarLuzSalon();
                break;

            case CONSULTAR_CAMARA_SALON:
                consutarCamaraSalon();
                break;

            case ENCENDER_CAMARA_SALON:
                encenderCamaraSalon();
                break;

            case APAGAR_CAMARA_SALON:
                apagarCamaraSalon();
                break;
            case CONSULTAR_PERSIANA_DORMITORIO:
                consutarPersianaDormitorio();
                break;
            case SUBIR_PERSIANA_DORMITORIO:
                subirPersianaDormitorio();
                break;
            case BAJAR_PERSIANA_DORMITORIO:
                bajarPersianaDormitorio();
                break;
            case CONSULTAR_CAMARA_DORMITORIO:
                consutarCamaraDormitorio();
                break;
            case ENCENDER_CAMARA_DORMITORIO:
                encenderCamaraDormitorio();
                break;

            case APAGAR_CAMARA_DORMITORIO:
                apagarCamaraDormitorio();
                break;
            case CONSULTAR_LUZ_DORMITORIO:
                consutarLuzDormitorio();
                break;
            case ENCENDER_LUZ_DORMITORIO:
                encenderLuzDormitorio();
                break;

            case APAGAR_LUZ_DORMITORIO:
                apagarLuzDormitorio();
                break;

            case CONSULTAR_PERSIANA_DESPACHO:
                consutarPersianaDespacho();
                break;
            case SUBIR_PERSIANA_DESPACHO:
                subirPersianaDespacho();
                break;
            case BAJAR_PERSIANA_DESPACHO:
                bajarPersianaDespacho();
                break;
            case CONSULTAR_CAMARA_DESPACHO:
                consutarCamaraDespacho();
                break;
            case ENCENDER_CAMARA_DESPACHO:
                encenderCamaraDespacho();
                break;
            case APAGAR_CAMARA_DESPACHO:
                apagarCamaraDespacho();
                break;
            case CONSULTAR_LUZ_DESPACHO:
                consutarLuzDespacho();
                break;
            case ENCENDER_LUZ_DESPACHO:
                encenderLuzDespacho();
                break;
            case APAGAR_LUZ_DESPACHO:
                apagarLuzDespacho();
                break;
            case APAGADO_GENERAL:
                apagadoGeneral();
                break;
            case APAGADO_ECO:
                apagadoEco();

                break;

        }

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