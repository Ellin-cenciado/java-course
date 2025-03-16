import java.util.Scanner;

public class NuevoSwitch {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);
        System.out.println("Ingrese un numero del 1 al 7");
        var dia = Integer.parseInt(consola.nextLine());
        var nombreDia = new String();
        nombreDia = switch (dia) {
            case 1 -> "Lunes";
            case 2 -> "Martes";
            case 3 -> "Miercoles";
            case 4 -> "Jueves";
            case 5 -> "Viernes";
            case 6 -> "Sabado";
            case 7 -> "Domingo";
            default -> "Numero invalido";
        };
        System.out.println("El numero corresponde al dia: "+ nombreDia);
    }
}
