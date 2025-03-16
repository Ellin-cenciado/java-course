import java.util.Scanner;

public class DescuentoVIP {
    public static void main(String[] args) {
        final var CANT_REQ = 10;
        final var DESC = 0.25;
        var consola = new Scanner(System.in);
        System.out.print("Cuantos Articulos has comprado? ");
        var articulos = Integer.parseInt(consola.nextLine());

        System.out.print("Valor total de compra: ");
        var valorTotal = Integer.parseInt(consola.nextLine());

        System.out.println("Tienes membresia de la tienda?");
        var membresia = Boolean.parseBoolean(consola.nextLine());

        var esElegibleDesc = articulos >= CANT_REQ && membresia;

        var valorFinal = esElegibleDesc ? valorTotal - valorTotal*DESC : valorTotal;
        System.out.println("Valor final de la compra es de: " + valorFinal);
    }
}
