/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viviendadomotica;

/**
 *
 * @author Jesus
 */
public enum Comando {
//Los tipos tienen dos caracteristicas fundamentales
// 1.-El constructor es privado
// 2.- solo puede instanciarse con un tipo de objeto concreto
    //Sistema
    APAGAR_SISTEMA(0, "Apagar Sistema"),
    CONSULTAR_HORA(1, "Consulta la hora del sistema"),
    MODIFICAR_HORA(2, "Modifica la hora de la centralita"),
    //Garaje
    CONSULTAR_PUERTA_GARAJE(3, "Consultar puerta del garaje"),
    ABRIR_PUERTA_GARAJE(4, "Subir puerta del garaje"),
    CERRAR_PUERTA_GARAJE(5, "Cerrar puerta del garaje"),
    //Salon
    CONSULTAR_PERSIANA_SALON(6, "Consultar persiana del salon"),
    SUBIR_PERSIANA_SALON(7, "Subir persiana del salon"),
    BAJAR_PERSIANA_SALON(8, "Bajar persiana del salon"),
    CONSULTAR_LUZ_SALON(9, "Consultar luz dpersianael salon"),   
    ENCENDER_LUZ_SALON(10, "Encender luz del salon"),
    APAGAR_LUZ_SALON(11, "Apagar luz del salon"),
    CONSULTAR_CAMARA_SALON(12, "Consulta cámara del salon"),
    ENCENDER_CAMARA_SALON(13, "Encender cámara del salon"),
    APAGAR_CAMARA_SALON(14, "Apagar cámara del salon"),    
    //Dormitorio
    CONSULTAR_PERSIANA_DORMITORIO(15, "Consultar persiana del dormitorio"),
    SUBIR_PERSIANA_DORMITORIO(16, "Subir persiana del dormitorio"),
    BAJAR_PERSIANA_DORMITORIO(18, "bajar persiana del dormitorio"),
    CONSULTAR_CAMARA_DORMITORIO(19, "Consulta cámara del dormitorio"),
    ENCENDER_CAMARA_DORMITORIO(20, "Encender cámara del dormitorio"),
    APAGAR_CAMARA_DORMITORIO(21, "Apagar cámara del dormitorio"),
    CONSULTAR_LUZ_DORMITORIO(22, "Consultar persiana del salon"),
    ENCENDER_LUZ_DORMITORIO(23, "Encender luz del dormitorio"),
    APAGAR_LUZ_DORMITORIO(24, "Apagar luz del dormitorio"),
    //Despacho
    CONSULTAR_PERSIANA_DESPACHO(25, "Consultar persiana del despacho"),
    SUBIR_PERSIANA_DESPACHO(26, "Subir persiana del despacho"),
    BAJAR_PERSIANA_DESPACHO(27, "bajar persiana del despacho"),
    CONSULTAR_CAMARA_DESPACHO(28, "Consulta cámara del despacho"),
    ENCENDER_CAMARA_DESPACHO(29, "Encender cámara del despacho"),
    APAGAR_CAMARA_DESPACHO(30, "Apagar cámara del despacho"),
    CONSULTAR_LUZ_DESPACHO(31, "Consultar persiana del despacho"),
    ENCENDER_LUZ_DESPACHO(32, "Encender luz del despacho"),
    APAGAR_LUZ_DESPACHO(33, "Apagar luz del despacho"),
    APAGADO_GENERAL (34, "Apagado general"),
    APAGADO_ECO (35, "Apagado general");
    
    /*                
               
             
 */
    private int codigo;
    private String descripcion;

    private Comando(int codigo, String descripcion) {
        this.codigo = codigo;
        this.descripcion = descripcion;

    }

    public int getCodigo() {
        return this.codigo;
    }

    public String getDescripcion() {

        return this.descripcion;
    }
}

