package animales;

public class Animal {
    protected void comer(){
        System.out.println("Comiendo");
    }
    public void dormir(){
        System.out.println("Durmiendo");
    }
    public void hacerSonido(){
        System.out.println("*sonido de animal");
    }

}

class Perro extends Animal {
    private void ladrar(){
        System.out.println("Woof woof");
    }

    @Override
    public void dormir(){
        super.dormir();
        System.out.println("^^Pero tambien duermo en perro");
    }
    public void hacerSonido(){
        ladrar();
    }

}

class Gato extends Animal{
    public void hacerSonido(){
        System.out.println("Meow Meow");
    }
}

class PruebaAnimal{

    public static void main(String[] args) {
        System.out.println("Clase animal: ");
        var animal1 = new Animal();
        animal1.comer();
        animal1.dormir(); //Si puedo acceder desde la misma clase
        System.out.println("\nClase perro: ");
        var perro = new Perro();
        perro.comer();
        perro.dormir();
        //perro.ladrar();
        perro.hacerSonido();
        System.out.println("\nGato:");
        var gato = new Gato();
        gato.hacerSonido();

        //Tambien puedo hacer una funcion
        System.out.println("\nEn forma de funcion: ");
        hacerSonido(gato);
        hacerSonido(perro);
        hacerSonido(animal1);
    }
     static void hacerSonido(Animal animal){
        animal.hacerSonido();
    }

}