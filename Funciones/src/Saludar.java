import java.util.Scanner;

public class Saludar {

    static void saludos(String mensaje, int cantidad){
        for (int i = 0; i != cantidad; i++){
            System.out.println(mensaje);
        }
    }
    public static void main(String[] args) {

        var consola = new Scanner(System.in);
        System.out.println("Cuantas veces desea saludar?");
        int cantidad = 0;
        while (cantidad<=0){
            cantidad = Integer.parseInt(consola.nextLine());
            if (cantidad <= 0){
                System.out.println("Ingrese una cantidad valida");
            }
        }
        System.out.println("Ingrese un mensaje");
        var mensaje = consola.nextLine();
        System.out.println("Salida: \n");
        saludos(mensaje,cantidad);

    }
}
