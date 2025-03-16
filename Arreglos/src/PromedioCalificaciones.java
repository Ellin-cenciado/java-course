import java.util.Scanner;

public class PromedioCalificaciones {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);

        System.out.println("Cuantas calificaciones quieres agregar?");
        var cantidad = Integer.parseInt(consola.nextLine());
        int[] calificaciones = new int[cantidad];
        float totalCalif = 0;

        for (int i = 0; i < cantidad; i++){
            System.out.printf("Agregue la calificacion Nro. %d: ",(i+1));
            var calif = Integer.parseInt(consola.nextLine());
            calificaciones[i] = calif;
            totalCalif += calif;
        }
        totalCalif /= cantidad;
        System.out.print("\nEl promedio de las notas: ");
        for (int i = 0; i<cantidad; i++){
            System.out.printf("%.2f ",(float)calificaciones[i]);
        }
        System.out.printf("es de %.2f", totalCalif);
    }
}
