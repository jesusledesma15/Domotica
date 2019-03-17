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
    
    private static void menuDomotica() {
        Scanner teclado = new Scanner(System.in);
        int numAction = 0;
        do {
            System.out.println("--MENÚ DE LA DOMOTICA--");
            System.out.println("1. Salón");
            System.out.println("2. Dormitorio");
            System.out.println("3. Despacho");
            System.out.println("4. Garaje");
            System.out.println("5. Sistema");
            System.out.println("6. Salir");
            System.out.print("Elige una habitación: ");
            numAction = teclado.nextInt();
            if (numAction < 1 || numAction > 6) {
                System.out.println("Elija una opción válida");
            }
            
            switch (numAction) {
                case 1:
                    menuSalon();
                    break;
                case 2:
                    menuDormitorio();
                    break;
                case 3:
                    menuDespacho();
                    break;
                case 4:
                    menuGaraje();
                    break;
                case 5:
                    menuSistema();
                    break;
                case 6:
                    System.out.println("Has elejido salir del menú");
            }
            
        } while (numAction != 6);
    }

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
    
    private static Comando menuDormitorio() {
        Scanner teclado = new Scanner(System.in);
        int numAction;
        int optLuz, optPersiana, optCam;
        do {
            
            System.out.println("--DORMITORIO--");
            System.out.println("1. Luces");
            System.out.println("2. Persianas");
            System.out.println("3. Cámaras");
            System.out.println("4. Salir");
            System.out.print("Elige una acción: ");
            numAction = teclado.nextInt();
            switch (numAction) {
                case 1:
                    do {
                        
                        System.out.println("-- Luces del Dormitorio--");
                        System.out.println("1. Consultar Luz");
                        System.out.println("2. Encender Luz");
                        System.out.println("3. Apagar Luz");
                        System.out.println("4. Salir");
                        optLuz = teclado.nextInt();
                        switch (optLuz) {
                            case 1:
                                return Comando.CONSULTAR_LUZ_DORMITORIO;
                            case 2:
                                return Comando.ENCENDER_LUZ_DORMITORIO;
                            case 3:
                                return Comando.APAGAR_LUZ_DORMITORIO;
                        }
                    } while (!(optLuz == 4));
                    break;
                case 2:
                    do {
                        
                        System.out.println("-- Persianas del dormitorio--");
                        System.out.println("1. Consultar persiana");
                        System.out.println("2. Subir persiana");
                        System.out.println("3. Bajar persiana");
                        System.out.println("4. Salir");
                        optPersiana = teclado.nextInt();
                        switch (optPersiana) {
                            case 1:
                                return Comando.CONSULTAR_PERSIANA_DORMITORIO;
                            case 2:
                                return Comando.SUBIR_PERSIANA_DORMITORIO;
                            case 3:
                                return Comando.BAJAR_PERSIANA_DORMITORIO;
                        }
                        break;
                    } while (!(optPersiana == 4));
                    break;
                case 3:
                    do {
                        System.out.println("-- Cámaras del dormitorio--");
                        System.out.println("1. Consultar Cámara");
                        System.out.println("2. Apagar Cámara");
                        System.out.println("3. Encender Cámara");
                        System.out.println("4. Salir");
                        optCam = teclado.nextInt();
                        switch (optCam) {
                            case 1:
                                return Comando.CONSULTAR_CAMARA_DORMITORIO;
                            case 2:
                                return Comando.ENCENDER_CAMARA_DORMITORIO;
                            case 3:
                                return Comando.APAGAR_CAMARA_DORMITORIO;
                        }
                        
                    } while (!(optCam == 4));
                    break;
            }
        } while (!(numAction == 4));
        return null;
    }
    
    private static Comando menuDespacho() {
        Scanner teclado = new Scanner(System.in);
        int numAction;
        int optLuz, optPersiana, optCam;
        do {
            
            System.out.println("--DESPACHO--");
            System.out.println("1. Luces");
            System.out.println("2. Persianas");
            System.out.println("3. Cámaras");
            System.out.println("4. Salir");
            System.out.print("Elige una acción: ");
            numAction = teclado.nextInt();
            switch (numAction) {
                case 1:
                    do {
                        
                        System.out.println("-- Luces del despacho--");
                        System.out.println("1. Consultar Luz");
                        System.out.println("2. Encender Luz");
                        System.out.println("3. Apagar Luz");
                        System.out.println("4. Salir");
                        optLuz = teclado.nextInt();
                        switch (optLuz) {
                            case 1:
                                return Comando.CONSULTAR_LUZ_DESPACHO;
                            case 2:
                                return Comando.ENCENDER_LUZ_DESPACHO;
                            case 3:
                                return Comando.APAGAR_LUZ_DESPACHO;
                        }
                    } while (!(optLuz == 4));
                    break;
                case 2:
                    do {
                        
                        System.out.println("-- Persianas del despacho--");
                        System.out.println("1. Consultar persiana");
                        System.out.println("2. Subir persiana");
                        System.out.println("3. Bajar persiana");
                        System.out.println("4. Salir");
                        optPersiana = teclado.nextInt();
                        switch (optPersiana) {
                            case 1:
                                return Comando.CONSULTAR_PERSIANA_DESPACHO;
                            case 2:
                                return Comando.SUBIR_PERSIANA_DESPACHO;
                            case 3:
                                return Comando.BAJAR_PERSIANA_DESPACHO;
                        }
                        break;
                    } while (!(optPersiana == 4));
                    break;
                case 3:
                    do {
                        System.out.println("-- Cámaras del despacho--");
                        System.out.println("1. Consultar Cámara");
                        System.out.println("2. Apagar Cámara");
                        System.out.println("3. Encender Cámara");
                        System.out.println("4. Salir");
                        optCam = teclado.nextInt();
                        switch (optCam) {
                            case 1:
                                return Comando.CONSULTAR_CAMARA_DESPACHO;
                            case 2:
                                return Comando.ENCENDER_CAMARA_DESPACHO;
                            case 3:
                                return Comando.APAGAR_CAMARA_DESPACHO;
                        }
                        
                    } while (!(optCam == 4));
                    break;
            }
        } while (!(numAction == 4));
        return null;
    }
    
    private static Comando menuGaraje() {
        Scanner teclado = new Scanner(System.in);
        int numAction;
        do {
            System.out.println("--GARAJE--");
            System.out.println("1. Consultar puerta");
            System.out.println("2. Abrir puerta");
            System.out.println("3. Cerrar puerta");
            System.out.println("4. Salir");
            System.out.print("Elige una acción: ");
            numAction = teclado.nextInt();
            switch (numAction) {
                case 1:
                    return Comando.CONSULTAR_PUERTA_GARAJE;
                case 2:
                    return Comando.ABRIR_PUERTA_GARAJE;
                case 3:
                    return Comando.CERRAR_PUERTA_GARAJE;
            }
        } while (!(numAction == 4));
        return null;
    }
    
        private static Comando menuSistema() {
        Scanner teclado = new Scanner(System.in);
        int numAction = 0;
        do {
            System.out.println("--SISTEMA--");
            System.out.println("1. Consultar hora");
            System.out.println("2. Cambiar hora");
            System.out.println("3. Apagar sistema");
            System.out.println("4. Salir");
            System.out.print("Elige una acción: ");
            numAction = teclado.nextInt();
            switch (numAction) {
                case 1:
                    return Comando.CONSULTAR_HORA;
                case 2:
                    return Comando.MODIFICAR_HORA;
                case 3:
                    return Comando.APAGAR_SISTEMA;
            }
            
        } while (numAction != 4);
        return null;
    }
}
