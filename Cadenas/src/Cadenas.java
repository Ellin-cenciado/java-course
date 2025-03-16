public class Cadenas {
    public static void main(String[] args) {
        System.out.println("Manejo de cadenas");
        var cadena1 = "Cadena 1";
        var cadena2 = new String("Cadena 2");
        String cadena3 = "Cadena 3";
        var cadenaMultilinea = """
                Cadena Multilinea/Textblock""";
        System.out.println("Cadena 1 = " + cadena1);
        System.out.printf("Cadena 2 = %s", cadena2);
        System.out.println("Cadena 3 = " + cadena3);
        System.out.println("Textblock = " + cadenaMultilinea);
    }
}
