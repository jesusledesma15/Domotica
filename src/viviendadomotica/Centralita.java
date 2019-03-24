/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domotica;

import java.time.LocalDate;
import java.time.LocalTime;
import viviendadomotica.Reloj;
import viviendadomotica.Salon;
import viviendadomotica.Usuario;

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
    
       //MÉTODOS PARA EL SALON
    //LUCES
    public void encenderLuzSalon() {
        if (!salon.getLuz().isEstado()) {
            salon.getLuz().setEstado(true);
            System.out.println("Luz del salon encendida");
        }
    }

    public void apagarLuzSalon() {
        if (!salon.getLuz().isEstado()) {
            salon.getLuz().setEstado(false);
            System.out.println("Luz del salon apagada");
        }
    }

    public void consutarLuzSalon() {
        System.out.println("La luz del salon está " + salon.getLuz().isEstado());
    }

    //PERSIANAS
    public void mediaPersianaSalon() {
        if (this.salon.getPersiana().isEstado() != 2) {
            this.salon.getPersiana().setEstado(2);
            System.out.println("La persiana del salon ha sido puesta a media altura");
        }
    }

    public void bajarPersianaSalon() {
        if (this.salon.getPersiana().isEstado() != 0) {
            this.salon.getPersiana().setEstado(0);
            System.out.println("Persiana del salon bajada");
        }
    }

    public void subirPersianaSalon() {
        if (this.salon.getPersiana().isEstado() != 1) {
            this.salon.getPersiana().setEstado(1);
            System.out.println("Persiana del salon subida");
        }
    }

    public void consutarPersianaSalon() {
        System.out.println("La persiana del salon está " + salon.getPersiana().isEstado());
    }

    //CAMARAS
    public void encenderCamaraSalon() {
        if (!this.salon.getCamara().isEstado()) {
            this.salon.getCamara().setEstado(true);
            System.out.println("Cámara del salon encendida");
        }
    }

    public void apagarCamaraSalon() {
        if (this.salon.getCamara().isEstado()) {
            this.salon.getCamara().setEstado(false);
            System.out.println("Cámara del salon apagada");
        }
    }

    public void consutarCamaraSalon() {
        System.out.println("La Camara del salon está " + salon.getCamara().isEstado());
    }

    //MÉTODOS PARA EL DORMITORIO
    //LUCES
    public void encenderLuzDormitorio() {
        if (!dormitorio.getLuz().isEstado()) {
            dormitorio.getLuz().setEstado(true);
            System.out.println("Luz del dormitorio encendida");
        }
    }

    public void apagarLuzDormitorio() {
        if (!dormitorio.getLuz().isEstado()) {
            dormitorio.getLuz().setEstado(false);
            System.out.println("Luz del dormitorio apagada");
        }
    }

    public void consutarLuzDormitorio() {
        System.out.println("La luz del dormitorio está " + dormitorio.getLuz().isEstado());
    }

    //PERSIANAS
    public void mediaPersianaDormitorio() {
        if (this.dormitorio.getPersiana().isEstado() != 2) {
            this.dormitorio.getPersiana().setEstado(2);
            System.out.println("La persiana del dormitorio ha sido puesta a media altura");
        }
    }

    public void bajarPersianaDormitorio() {
        if (this.dormitorio.getPersiana().isEstado() != 0) {
            this.dormitorio.getPersiana().setEstado(0);
            System.out.println("Persiana del dormitorio bajada");
        }
    }

    public void subirPersianaDormitorio() {
        if (this.dormitorio.getPersiana().isEstado() != 1) {
            this.dormitorio.getPersiana().setEstado(1);
            System.out.println("Persiana del dormitorio subida");
        }
    }

    public void consutarPersianaDormitorio() {
        System.out.println("La persiana del dormitorio está " + dormitorio.getPersiana().isEstado());
    }

    //CAMARAS
    public void encenderCamaraDormitorio() {
        if (!this.dormitorio.getCamara().isEstado()) {
            this.dormitorio.getCamara().setEstado(true);
            System.out.println("Cámara del dormitorio encendida");
        }
    }

    public void apagarCamaraDormitorio() {
        if (this.dormitorio.getCamara().isEstado()) {
            this.dormitorio.getCamara().setEstado(false);
            System.out.println("Cámara del dormitorio apagada");
        }
    }

    public void consutarCamaraDormitorio() {
        System.out.println("La Camara del dormitorio está " + dormitorio.getCamara().isEstado());
    }

    //MÉTODOS PARA EL DESPACHO
    //LUCES
    public void encenderLuzDespacho() {
        if (!despacho.getLuz().isEstado()) {
            despacho.getLuz().setEstado(true);
            System.out.println("Luz del despacho encendida");
        }
    }

    public void apagarLuzDespacho() {
        if (!despacho.getLuz().isEstado()) {
            despacho.getLuz().setEstado(false);
            System.out.println("Luz del despacho apagada");
        }
    }

    public void consutarLuzDespacho() {
        System.out.println("La luz del despacho está " + despacho.getLuz().isEstado());
    }

    //PERSIANAS
    public void mediaPersianaDespacho() {
        if (this.despacho.getPersiana().isEstado() != 2) {
            this.despacho.getPersiana().setEstado(2);
            System.out.println("La persiana del despacho ha sido puesta a media altura");
        }
    }

    public void bajarPersianaDespacho() {
        if (this.despacho.getPersiana().isEstado() != 0) {
            this.despacho.getPersiana().setEstado(0);
            System.out.println("Persiana del despacho bajada");
        }
    }

    public void subirPersianaDespacho() {
        if (this.despacho.getPersiana().isEstado() != 1) {
            this.despacho.getPersiana().setEstado(1);
            System.out.println("Persiana del despacho subida");
        }
    }

    public void consutarPersianaDespacho() {
        System.out.println("La persiana del despacho está " + despacho.getPersiana().isEstado());
    }

    //CAMARAS
    public void encenderCamaraDespacho() {
        if (!this.despacho.getCamara().isEstado()) {
            this.despacho.getCamara().setEstado(true);
            System.out.println("Cámara del despacho encendida");
        }
    }

    public void apagarCamaraDespacho() {
        if (this.despacho.getCamara().isEstado()) {
            this.despacho.getCamara().setEstado(false);
            System.out.println("Cámara del despacho apagada");
        }
    }

    public void consutarCamaraDespacho() {
        System.out.println("La Camara del despacho está " + despacho.getCamara().isEstado());
    }

    //GARAJE
    public void abrirGaraje() {
        if (!garaje.getPuerta().isEstado()) {
            garaje.getPuerta().setEstado(true);
            System.out.println("Puerta del garaje abierta");
        }
    }

    public void cerrarGaraje() {
        if (garaje.getPuerta().isEstado()) {
            garaje.getPuerta().setEstado(false);
            System.out.println("Puerta del garaje cerrada");
        }
    }

    public void consutarPuertaGaraje() {
        System.out.println("La puerta del garaje está " + garaje.getPuerta().isEstado());
    }

    //METODOS HORAS
    public void consultarHora() {

    }

    public void modificarHora() {

    }

    //MÉTODOS FECHA
    public void consultarFecha() {

    }

    public void modificarFecha() {

    }

    //MÉTODOS GENERALLES
    public void apagadoGeneral() {
        if (salon.getLuz().isEstado()) {
            salon.getLuz().setEstado(false);
        }
        if (dormitorio.getLuz().isEstado()) {
            dormitorio.getLuz().setEstado(false);
        }
        if (despacho.getLuz().isEstado()) {
            despacho.getLuz().setEstado(false);
        }
    }

    public void apagadoEco() {
        LocalTime ahora = LocalTime.now();
        if (salon.getLuz().isEstado() == true && ahora.getHour() < 18 && ahora.getHour() > 8
                && salon.getPersiana().isEstado() == 1) {
            salon.getLuz().setEstado(false);
            System.out.println("Luz del salon apagada");
        }
        if (dormitorio.getLuz().isEstado() == true && ahora.getHour() < 18 && ahora.getHour() > 8
                && dormitorio.getPersiana().isEstado() == 1) {
            dormitorio.getLuz().setEstado(false);
            System.out.println("Luz del dormitorio apagada");
        }
        if (despacho.getLuz().isEstado() == true && ahora.getHour() < 18 && ahora.getHour() > 8
                && despacho.getPersiana().isEstado() == 1) {
            despacho.getLuz().setEstado(false);
            System.out.println("Luz del despacho apagada");
        }
    }

    public boolean comprobarUsuario(Usuario aux) {

        return user.equals(aux);
    }

    public viviendadomotica.Garaje getGaraje() {
        return garaje;
    }

    public void setGaraje(viviendadomotica.Garaje garaje) {
        garaje = garaje;
    }

    public Salon getSalon() {
        return salon;
    }

    public void setSalon(Salon salon) {
        salon = salon;
    }

    public viviendadomotica.Dormitorio getDormitorio() {
        return dormitorio;
    }

    public void setDormitorio(viviendadomotica.Dormitorio dormitorio) {
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