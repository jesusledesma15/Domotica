/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viviendadomotica;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 *
 * @author Jesus
 */
public class Reloj {

    private static LocalDate fecha;
    private static LocalTime hora;

    public Reloj() {
    }

    public static LocalDate getFecha() {
        return fecha;
    }

    public static void setFecha(LocalDate fecha) {
        Reloj.fecha = fecha;
    }

    public static LocalTime getHora() {
        return hora;
    }

    public static void setHora(LocalTime hora) {
        Reloj.hora = hora;
    }
}
