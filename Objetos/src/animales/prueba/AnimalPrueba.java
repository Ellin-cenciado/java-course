package animales.prueba;

import animales.Animal;

public class AnimalPrueba {
    public static void main(String[] args) {
        System.out.println("Clase animal: ");
        var animal = new Animal();
        animal.dormir();
        //animal.comer(); no puedo acceder porque es protected
        //var perro = new Perro(); Tampoco a la clase perro
    }
}
