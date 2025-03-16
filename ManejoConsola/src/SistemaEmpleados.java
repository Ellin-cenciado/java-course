import java.util.Arrays;
import java.util.Scanner;

public class SistemaEmpleados {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);

        System.out.print("Nombre del empleado: ");
        var nombre = consola.nextLine();
        System.out.print("Edad del empleado: ");
        var edad = Integer.parseInt(consola.nextLine());
        System.out.print("Email del empleado: ");
        var email = consola.nextLine();
        System.out.print("Salario del empleado: ");
        var salario = Double.parseDouble(consola.nextLine());
        System.out.print("Es jefe de departamento? (t/f): ");
        var jefe = consola.nextLine().charAt(0) == 't';

        //Imprime los valores del empleado
        System.out.println("\nDatos del empleado");
        System.out.println("\tNombre: " + nombre);
        System.out.println("\tEdad: " + edad);
        System.out.println("\tEmail: " + email);
        System.out.printf("\tSalario: $%.2f%n", salario);//%.2f para dos decimales
        //%n para el salto de linea en texto formatted
        System.out.println("\tEs jefe de departamento?: " + jefe);

    }
}
