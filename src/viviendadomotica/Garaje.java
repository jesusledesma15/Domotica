/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domo;

/**
 *
 * @author salva
 */
//La clase garaje es un subtipo o subclase de estancia
//garaje extiende(hereda) a Estancia. Garaje hereda de extancia
public class Garaje extends Estancia{
    
    private int capacidadVehiculos;
    private PuertaAutomatica puerta;
    
    //Los constructores son los unicos metodos que no se heredan

    public Garaje(int capacidadVehiculos, PuertaAutomatica puerta, int m2) {
        //llamada al constructor de la clase padre
        super(m2);
        this.capacidadVehiculos = capacidadVehiculos;
        this.puerta = puerta;
    }
    
    
    public Garaje(){
        super(); //crea la estancia con m2=0
        this.capacidadVehiculos = 0;
        this.puerta = new PuertaAutomatica();
    }

    public int getCapacidadVehiculos() {
        return capacidadVehiculos;
    }

    public void setCapacidadVehiculos(int capacidadVehiculos) {
        this.capacidadVehiculos = capacidadVehiculos;
    }

    public PuertaAutomatica getPuerta() {
        return puerta;
    }

    public void setPuerta(PuertaAutomatica puerta) {
        this.puerta = puerta;
    }

    //Ejemplo de acceso a metodo heredado usando el puntero super
    //que apunta a la clase padre de la clase en la eque estoy
    @Override
    public String toString() {
        return super.toString()+ "\ncapacidadVehiculos=" + capacidadVehiculos + ",\n puerta=" + puerta + '}';
    }
    
    
}
