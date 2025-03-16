import java.util.Scanner;

public class DescuentoTienda {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);

        System.out.println("Cuenta con membresia?");
        var membresia = Boolean.parseBoolean(consola.nextLine());

        System.out.println("Coste total de la compra? ");
        var costeTotal = Double.parseDouble(consola.nextLine());

        if (membresia && costeTotal >= 1000){
            System.out.println("Tiene acceso al descuento de 10%");
            costeTotal = costeTotal - costeTotal * 0.1;
        } else if (membresia) {
            System.out.println("Tiene acceso al descuento de 5%");
            costeTotal = costeTotal - costeTotal *0.05;
        }
        System.out.println("El valor total de la compra es de: " + costeTotal);
    }
}
