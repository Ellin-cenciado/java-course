import java.util.Scanner;

public class SumaDiagonal {
    public static void main(String[] args) {
        //Defino una matriz
        var consola = new Scanner(System.in);
        System.out.println("Ingrese cantidad de filas: ");
        int N = Integer.parseInt(consola.nextLine());
        System.out.println("Ingrese cantidad de columnas: ");
        int M = Integer.parseInt(consola.nextLine());

        int diagonal = 0;

        int[][] matriz = new int[N][M];
        for (int fila = 0; fila < N; fila++){
            for (int columna = 0; columna < M; columna++){
                System.out.println("Ingrese el vector a["+ (fila+1) + "]" + "[" + (columna+1) + "]");
                matriz[fila][columna] = Integer.parseInt(consola.nextLine());
                if (fila == columna){
                    diagonal += matriz[fila][columna];
                }
            }
        }
        System.out.println("La matriz resultante es: ");
        for (int fila = 0; fila < N; fila++){

            for (int columna = 0; columna < M; columna++){
                System.out.printf("|%d",matriz[fila][columna]);
            }
            System.out.print("|\n");
        }
        System.out.println("El valor de la diagonal es: " + diagonal);
    }
}
