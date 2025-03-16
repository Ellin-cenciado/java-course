public class ConcatenarCadenas {
    public static void main(String[] args) {
        var cadena1 = "Hola";
        var cadena2 = "Mundo";
        var cadena3 = cadena1 + " " + cadena2;
        System.out.println("Cadena3: " + cadena3);

        //Metodo concat
        cadena3 = cadena1.concat(cadena2);
        System.out.println("Nueva cadena3: " + cadena3);
        //Pero queda mal, puedo hacer esto
        cadena3 = (cadena1.concat(" ")).concat(cadena2);
        System.out.println("Cadena3: ".concat(cadena3));

        //Metodo String Builder
        var constructorCadenas = new StringBuilder();
        constructorCadenas.append(cadena1).append(" ").append(cadena2);
        System.out.println("ConstructorCadenas: ".concat(constructorCadenas.toString()));

        //StringBuffer
        var stringBuffer = new StringBuffer();
        stringBuffer.append(cadena1).append(" ").append(cadena2).toString();
        System.out.println("stringBuffer: " + stringBuffer);

        //Join
        var join = String.join(" ", cadena1, cadena2);
        System.out.println("Join: " + join);
    }
}
