public class MetodosCadenas {
    public static void main(String[] args) {
        // Metodo de cadenas
        var cadena1 = "Hola Mundo";
        System.out.println("Cadena 1 = " + cadena1);
        System.out.println("Largo = " + cadena1.length());

        //Reemplazar caracteres (reminder que el metodo crea un nuevo objeto)
        System.out.println("cadena1.replace = " + cadena1.replace('a','o'));

        //Pasar a mayus
        System.out.println("cadena1.toUpperCase = " + cadena1.toUpperCase());

        //Pasar a minus
        System.out.println("cadena1.toLowerCase = " + cadena1.toUpperCase());

        //Eliminar espacios al inicio y al final
        var cadena2 = "        cadena2  ";
        System.out.println("cadena2 = " + cadena2);
        System.out.println("cadena2.trim = " + cadena2.trim());
    }
}
