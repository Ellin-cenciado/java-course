import java.util.Random;
import java.util.Scanner;

public class GeneradorIdUnico {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);

        System.out.print("Nombre: ");
        var nombre = new String(consola.nextLine());
        System.out.print("Apellido: ");
        var apellido = new String(consola.nextLine());
        System.out.print("Nacimiento (YYYY): ");
        var nacimiento = consola.nextLine();
        var random = new Random();
        var numeroAleatorio = random.nextInt(9999)+1;
        var numeroFinal = String.format("%04d",numeroAleatorio);

        var idUnico = new String(
                nombre.toUpperCase().substring(0,2)
                 +apellido.toUpperCase().substring(0,2)
                 +nacimiento.substring(2,4)+numeroFinal
        );

        System.out.printf("Aleatorio: %s\nIdUnico: %s", numeroFinal,idUnico);
    }
}
