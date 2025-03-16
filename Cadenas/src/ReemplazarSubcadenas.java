public class ReemplazarSubcadenas {
    public static void main(String[] args) {
        var cadena = "Hola mundo";
        System.out.println("Cadena original: " + cadena);
        var nuevaCadena = cadena.replace("Hola", "Adios");
        System.out.println("Nueva cadena: " + nuevaCadena);

        //Acordarse que las cadenas son inmutables, lo que hace la funcion
        //es generar una nueva cadena, no modifica la original
        nuevaCadena = cadena.replace("Hola", "Mundo");
        System.out.println("Nueva cadena: " + nuevaCadena);
    }
}
