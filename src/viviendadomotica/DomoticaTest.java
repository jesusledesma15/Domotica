package viviendadomotica;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Jesus
 */
public class DomoticaTest {

    public static void main(String[] args) {
        int contador = 0;

        Centralita centr = new Centralita();
        Usuario UsuAux = new Usuario();
        
        do {
            UsuAux = Vistas.login();
            contador++;

        } while (contador < 5 && !UsuAux.equals(centr.getUser()));

        if(centr.comprobarUsuario(UsuAux)){
            Vistas.menu();
        }else{
            System.out.println("El usuario es erroneo");
        }
    }
}