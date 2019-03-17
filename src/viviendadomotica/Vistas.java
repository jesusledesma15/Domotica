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

    private static Comando menuSalon() {
        Scanner teclado = new Scanner(System.in);
        int numAction;
        int optLuz, optPersiana, optCam;
        do {

            System.out.println("--SALON--");
            System.out.println("1. Luces");
            System.out.println("2. Persianas");
            System.out.println("3. Cámaras");
            System.out.println("4. Salir");
            System.out.print("Elige una acción: ");
            numAction = teclado.nextInt();
            switch (numAction) {
                case 1:
                    do {

                        System.out.println("-- Luces del Salón--");
                        System.out.println("1. Consultar Luz");
                        System.out.println("2. Encender Luz");
                        System.out.println("3. Apagar Luz");
                        System.out.println("4. Salir");
                        optLuz = teclado.nextInt();
                        switch (optLuz) {
                            case 1:
                                return Comando.CONSULTAR_LUZ_SALON;
                            case 2:
                                return Comando.ENCENDER_LUZ_SALON;
                            case 3:
                                return Comando.APAGAR_LUZ_SALON;
                        }
                    } while (!(optLuz == 4));
                    break;
                case 2:
                    do {

                        System.out.println("-- Persianas del salon--");
                        System.out.println("1. Consultar persiana");
                        System.out.println("2. Subir persiana");
                        System.out.println("3. Bajar persiana");
                        System.out.println("4. Salir");
                        optPersiana = teclado.nextInt();
                        switch (optPersiana) {
                            case 1:
                                return Comando.CONSULTAR_PERSIANA_SALON;
                            case 2:
                                return Comando.SUBIR_PERSIANA_SALON;
                            case 3:
                                return Comando.BAJAR_PERSIANA_SALON;
                        }
                        break;
                    } while (!(optPersiana == 4));
                    break;
                case 3:
                    do {
                        System.out.println("-- Cámaras del salón--");
                        System.out.println("1. Consultar Cámara");
                        System.out.println("2. Apagar Cámara");
                        System.out.println("3. Encender Cámara");
                        System.out.println("4. Salir");
                        optCam = teclado.nextInt();
                        switch (optCam) {
                            case 1:
                                return Comando.CONSULTAR_CAMARA_SALON;
                            case 2:
                                return Comando.ENCENDER_CAMARA_SALON;
                            case 3:
                                return Comando.APAGAR_CAMARA_SALON;
                        }

                    } while (!(optCam == 4));
                    break;
            }
        } while (!(numAction == 4));
        return null;
    }
}
