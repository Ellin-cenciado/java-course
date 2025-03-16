import java.util.Scanner;

public class numeroPositivo {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        var numero = Integer.parseInt(consola.nextLine());
        if (numero >=0) System.out.println("El numero es positivo");
        else {
            System.out.println("El numero es negativo");
        }
    }
}
