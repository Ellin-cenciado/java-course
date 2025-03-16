import java.util.Scanner;

public class Consola {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Introduce una linea de texto");
        var linea = scanner.nextLine();
        System.out.println("output: " + linea);
    }
}
