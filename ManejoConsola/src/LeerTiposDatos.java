import java.util.Scanner;

public class LeerTiposDatos {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);

        //Leer tipo int
        System.out.print("Ingresa tu edad: ");
        var edad = consola.nextInt();
        System.out.println("La edad ingresada es: " + edad);

        //Double
        System.out.print("Ingresar double: ");
        var varDouble = consola.nextDouble();
        System.out.println("double: " + varDouble);

        //Float
        System.out.print("Ingresar float: ");
        var varFloat = consola.nextFloat();
        System.out.println("Float: " + varFloat);
        
        //Problema con string, si ahora quiero leer un string no voy a poder
        System.out.print("Ingresar string: ");
        //Antes de ingresar un string hay que consumir el caracter de
        //salto de linea de las llamadas a print anteriores
        consola.nextLine();
        var varString = consola.nextLine();
        System.out.println("varString = " + varString);

        //Conversion de datos

        System.out.print("Ingresa un valor entero: ");
        var enteroString = consola.nextLine();
        var entero = Integer.parseInt(enteroString);
        System.out.println("entero = " + entero);

        System.out.print("Ingresa un valor flotante: ");
        varFloat = Float.parseFloat(consola.nextLine());
        System.out.println("varFloat = " + varFloat);
    }
}
