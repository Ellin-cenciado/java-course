public class CaracteresEspeciales {
    public static void main(String[] args) {
        //Caracteres especiales
        var cadena1 = new String("Hola \n Mundo");

        // \n es un salto de linea
        System.out.println("cadena1: " + cadena1);

        // \t es una tabulacion
        var cadena2 = new String("Hola \t Mundo");
        System.out.println("cadena2: " + cadena2);

        // \' Agrega una comilla simple y \" agrega una comilla doble
        var cadena3 = new String("Hola \' \" Mundo");
        System.out.println("cadena3: "+cadena3);

        // \\ Agrega una diagonal invertida
        var cadena4 = new String("Hola \\ Mundo");
        System.out.println("cadena4: " + cadena4);
    }
}
