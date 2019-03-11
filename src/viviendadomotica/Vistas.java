/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viviendadomotica;

import java.util.Scanner;

/**
 *
 * @author Jesus
 */
public class Vistas {
    public static Comando mostrarCamaras() {
        Scanner teclado = new Scanner(System.in);
        int numHabitacion;
        int optCamSalon, optDormitorio, optDespacho;
        boolean estadoCamSalon = false;
        boolean estadoCamDormitorio = false;
        boolean estadoCamDespacho = false;

        do {

            System.out.println("--CÁMARAS--");
            System.out.println("1. Salón");
            System.out.println("2. Dormitorio");
            System.out.println("3. Despacho");
            System.out.println("4. Salir");
            System.out.print("Elige la habitación: ");
            numHabitacion = teclado.nextInt();
            switch (numHabitacion) {
                case 1:
                    do {

                        System.out.println("-- CÁMARA DEL SALÓN--");
                        System.out.println("1. Consultar Cámara");
                        if (estadoCamSalon) {
                            System.out.println("2. Apagar Cámara");
                        } else {
                            System.out.println("2. Encender Cámara");
                        }
                        System.out.println("3. Salir");
                        optCamSalon = teclado.nextInt();
                        switch (optCamSalon) {
                            case 1:
                                return Comando.CONSULTAR_CAMARA_SALON;

                            case 2:
                                if (estadoCamSalon) {
                                    return Comando.APAGAR_CAMARA_SALON;
                                } else {
                                    return Comando.ENCENDER_CAMARA_SALON;
                                }
                        }

                    } while (!(optCamSalon == 3));
                    break;
                case 2:
                    do {

                        System.out.println("-- CÁMARA DEL DORMITORIO--");
                        System.out.println("1. Consultar Cámara");
                        if (estadoCamDormitorio) {
                            System.out.println("2. Apagar Cámara");
                        } else {
                            System.out.println("2. Encender Cámara");
                        }
                        System.out.println("3. Salir");
                        optDormitorio = teclado.nextInt();
                        switch (optDormitorio) {
                            case 1:
                                return Comando.CONSULTAR_CAMARA_DORMITORIO;
                            case 2:
                                if (estadoCamDormitorio) {
                                   return Comando.APAGAR_CAMARA_DORMITORIO;
                                } else {
                                   return Comando.ENCENDER_CAMARA_DORMITORIO;
                                }
                        }

                    } while (!(optDormitorio == 3));
                    break;
                case 3:
                    do {

                        System.out.println("-- CÁMARA DEL DESPACHO--");
                        System.out.println("1. Consultar Cámara");
                        if (estadoCamDormitorio) {
                            System.out.println("2. Apagar Cámara");
                        } else {
                            System.out.println("2. Encender Cámara");
                        }
                        System.out.println("3. Salir");
                        optDespacho = teclado.nextInt();
                        switch (optDespacho) {
                            case 1:
                                return Comando.CONSULTAR_CAMARA_DESPACHO;
                            case 2:
                                if (estadoCamDespacho) {
                                return Comando.APAGAR_CAMARA_DESPACHO;
                                } else {
                                return Comando.ENCENDER_CAMARA_DESPACHO;
                                }
                        }

                    } while (!(optDespacho == 3));
                    break;
                case 4:
                    return Comando.APAGAR_SISTEMA;
            }
        } while (!(numHabitacion == 4));
        return null;
    }
}