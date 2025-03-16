import java.util.Scanner;

public class Matrices {
    public static void main(String[] args) {
        //Defino una matriz
        final int N = 3;
        final int M = 3;
        int[][] matriz = new int[N][M];

        /*
        Otra forma de definir una matriz es usando
        int[][] matra = new int[][]{{1,2,3},{1,2,3},{1,2,3}};

        */
        var consola = new Scanner(System.in);

        for (int fila = 0; fila < N; fila++){
            for (int columna = 0; columna < M; columna++){
                System.out.println("Ingrese el vector a["+ (fila+1) + "]" + "[" + (columna+1) + "]");
                matriz[fila][columna] = Integer.parseInt(consola.nextLine());
            }
        }
        System.out.println("La matriz resultante es: ");
        for (int fila = 0; fila < N; fila++){

            for (int columna = 0; columna < M; columna++){
                System.out.printf("|%d",matriz[fila][columna]);
            }
            System.out.print("|\n");
        }
    }
}
