import java.util.Scanner;

public class DiaSemanaSwitch {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);
        System.out.println("Ingrese un numero del 1 al 7");
        var dia = consola.nextInt();
        var nombreDia = new String("");
        switch (dia){
            case 1:
                nombreDia = "Lunes";
                break;
            case 2:
                nombreDia = "Martes";
                break;
            case 3:
                nombreDia = "Miercoles";
                break;
            case 4:
                nombreDia = "Jueves";
                break;
            case 5:
                nombreDia = "Viernes";
                break;
            case 6:
                nombreDia = "Sabado";
                break;
            case 7:
                nombreDia = "Domingo";
                break;
            default:
                nombreDia = "Numero invalido";
                break;
        }
        System.out.println("El dia proporcionado corresponde a: " + nombreDia);

    }
}
