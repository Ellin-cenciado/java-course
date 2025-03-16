import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);
        final int SUMAR=1,RESTAR=2,MULTIPLICAR=3,DIVIDIR=4,SALIR=5;
        int opcion=0,valor1=0,valor2=0,resultado=0;
        float resulDivMul = 0.0f;
        while(opcion!=5){
            System.out.println("""
                    \nCalculadora (de enteros):
                    1.Sumar
                    2.Restar
                    3.Multiplicar
                    4.Dividir
                    5.Salir
                    """);
            opcion = Integer.parseInt(consola.nextLine());
            switch (opcion){
                case 1:
                    System.out.println("Ingrese valor 1: ");
                    valor1=Integer.parseInt(consola.nextLine());
                    System.out.println("Ingrese valor 2: ");
                    valor2 = Integer.parseInt(consola.nextLine());
                    resultado=valor1+valor2;
                    System.out.println("Resultado: "+ resultado);
                    opcion=0;
                    break;
                case 2:
                    System.out.println("Ingrese valor 1: ");
                    valor1=Integer.parseInt(consola.nextLine());
                    System.out.println("Ingrese valor 2: ");
                    valor2 = Integer.parseInt(consola.nextLine());
                    resultado=valor1-valor2;
                    System.out.println("Resultado: "+ resultado);
                    opcion=0;
                    break;
                case 3:
                    System.out.println("Ingrese valor 1: ");
                    valor1=Integer.parseInt(consola.nextLine());
                    System.out.println("Ingrese valor 2: ");
                    valor2 = Integer.parseInt(consola.nextLine());
                    resulDivMul=valor1*valor2;
                    System.out.println("Resultado: "+ resulDivMul);
                    opcion=0;
                    break;
                case 4:
                    System.out.println("Ingrese valor 1: ");
                    valor1=Integer.parseInt(consola.nextLine());
                    System.out.println("Ingrese valor 2: ");
                    valor2 = Integer.parseInt(consola.nextLine());
                    if(valor2 == 0){
                        System.out.println("Ingrese divisor valido..");
                        opcion=0;
                        break;
                    }
                    resulDivMul=(float)valor1/(float)valor2;
                    System.out.println("Resultado: "+ resulDivMul);
                    opcion=0;
                    break;
                default:
                    System.out.println("Opcion invalida, intente de nuevo\n");
                    opcion=0;
                    break;
            }
        }
    }
}
