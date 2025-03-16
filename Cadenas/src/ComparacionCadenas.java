public class ComparacionCadenas {
    public static void main(String[] args) {
        var cadena1 = "Java";
        var cadena2 = "Java";
        var cadena3 = new String("Java");
        //Comparacion de cadenas, compara si ambas variables hacen referencia al mismo
        //objeto;
        System.out.println("cadena1 y cadena2 referencian al mismo obj?");
        System.out.println(cadena1 == cadena2);
        System.out.println("cadena1 y cadena3 referencian al mismo obj?");
        System.out.println(cadena1 == cadena3);

        //Para comparar en contenido usamos el metodo equals
        System.out.println("El contenido de cadena1 y cadena3 es el mismo?");
        System.out.println(cadena1.equals(cadena3));

    }
}
