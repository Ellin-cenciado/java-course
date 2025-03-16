import java.util.Scanner;

public class DibujaTriangulo {
    public static void main(String[] args) {
        System.out.println("Ingrese el numero de filas");
        var consola = new Scanner(System.in);
        int renglones = Integer.parseInt(consola.nextLine());

        for (int i = 0; i <= renglones; i++){
            for (int j = 0; j <= renglones-i; j++){
                System.out.print(" ");
            }
            for (int k = 0; k<=2*i; k++){
                System.out.print("*");
            }
            System.out.print("\n");
        }

    }
}
