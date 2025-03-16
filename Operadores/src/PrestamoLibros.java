import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class PrestamoLibros {
    public static void main(String[] args) {
        final var MAX_DIST_PERM = 3;
        var consola = new Scanner(System.in);
        System.out.println("Cuenta con credencial estudiante?");
        var credencial = Boolean.parseBoolean(consola.nextLine());
        System.out.println("A cuantos KM vives de la biblioteca?");
        var distancia = Integer.parseInt(consola.nextLine());
        var res = distancia <= MAX_DIST_PERM && credencial;

        if (res){
            System.out.println("Puede sacar prestamos de la biblioteca");
        }else
        {
            System.out.println("No puede sacar prestamos de la biblioteca");
        }
    }
}
