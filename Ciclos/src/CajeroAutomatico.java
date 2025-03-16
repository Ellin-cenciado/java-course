import javax.print.attribute.standard.CopiesSupported;
import java.util.Scanner;

public class CajeroAutomatico {
    public static void main(String[] args) {
        //Opciones
        final int CONSULTAR = 1,RETIRAR=2,DEPOSITAR=3,SALIR=4;
        double saldo = 1000.00d; //1000.00
        var consola = new Scanner(System.in);
        var cantRetirar = 0.00d;
        var cantDeposito = 0.00d;
        int opcion=0;

        while(opcion != 4){

            System.out.println("""
                \nBienvenido al banco, que operacion desea realizar?\n
                1.Consulta de saldo
                2.Retiros
                3.Depositos
                4.Salir
                """);
            opcion = Integer.parseInt(consola.nextLine());

            switch (opcion){
            case 1:
                System.out.printf("Su saldo actual es de: $%.2f",saldo);
                opcion=0;
                break;
            case 2:
                System.out.println("Cuanto desea retirar? ");
                cantRetirar = Double.parseDouble(consola.nextLine());
                saldo = saldo-cantRetirar;
                System.out.printf("Ha retirado $%.2f, su saldo restante es de: $%.2f",cantRetirar,saldo);
                opcion=0;
                break;
            case 3:
                System.out.println("Cuanto desea depositar? ");
                cantDeposito = Double.parseDouble(consola.nextLine());;
                saldo +=cantDeposito;
                System.out.printf("Ha depositado $%.2f, su saldo restante es de: $%.2f",cantDeposito,saldo);
                opcion=0;
                break;
            case 4:
                System.out.println("Un placer, vuelva pronto!");
                opcion=4;
                break;
            default:
                System.out.println("Ingrese un numero valido");
                opcion = 0;
                break;
            }
        }
    }
}
