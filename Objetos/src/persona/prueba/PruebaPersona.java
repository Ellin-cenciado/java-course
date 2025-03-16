package persona.prueba;

import persona.Persona;

public class PruebaPersona {
    public static void main(String[] args) {
        System.out.println("Creacion de clases y objetos");

        System.out.println("CantidadPersonas: " + Persona.getContadorPersonas());
        var objeto1 = new Persona();
        System.out.println(objeto1); //Automaticamente se llama el metodo toString
        System.out.println("CantidadPersonas: " + Persona.getContadorPersonas());
        var objeto2 = new Persona("Juan","Perez");
        System.out.println(objeto2);
        System.out.println("CantidadPersonas: " + Persona.getContadorPersonas());


    }
}