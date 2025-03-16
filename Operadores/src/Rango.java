import java.util.Scanner;

public class Rango {
    public static void main(String[] args) {
        final var MINIMO = 0;
        final var MAXIMO = 5;
        System.out.printf("Verificar si un valor esta entre %d y %d\n",MINIMO,MAXIMO);
        var consola = new Scanner(System.in);

        System.out.print("Ingrese un valor: ");
        var valor = Integer.parseInt(consola.nextLine());
        var resultado = (valor >= MINIMO) && (valor <=MAXIMO);
        System.out.println(resultado);
    }
}
