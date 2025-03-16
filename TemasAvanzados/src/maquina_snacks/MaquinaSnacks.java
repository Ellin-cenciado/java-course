package maquina_snacks;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class MaquinaSnacks {
    public static void main(String[] args) {
        maquinaSnacks();
    }

    public static void maquinaSnacks(){
        boolean salir = false;
        Scanner consola = new Scanner(System.in);

        List<Snack> productos = new ArrayList<>();
        System.out.println("---Maquina de snacks---");
        Snacks.mostrarSnacks();

        while (!salir) {
            try{
                int opcion = mostrarMenu(consola);
                salir = ejecutarOpciones(opcion,consola,productos);
            } catch (Exception e) {
                System.out.println("Ha ocurrido un error" + e);
            }finally {
                System.out.println();
            }
        }
    }
    private static int mostrarMenu(Scanner consola){
        System.out.println("""
                1) Comprar snack
                2) Mostrar ticket
                3) Agregar snack
                4) Salir
                Elije una opcion:\s""");
        return Integer.parseInt(consola.nextLine());
    }
    private static boolean ejecutarOpciones(int opcion, Scanner consola,
                                            List<Snack> productos){
        var salir = false;
        switch(opcion){
            case 1 -> comprarSnack(consola,productos);
            case 2 -> mostrarTicket(productos);
            case 3 -> agregarSnack(consola);
            case 4 -> {
                System.out.println("Gracias por venir, Vuelva pronto!");
                salir = true;
            }
            default -> System.out.println("Opcion invalida! " + opcion);
        }
        return salir;
    }

    private static void comprarSnack(Scanner consola,List<Snack> productos){
        System.out.println("Que snack quieres comprar? ");
        int idSnack = Integer.parseInt(consola.nextLine());
        //Validar que el snack existe
        var snackEncontrado = false;
        for(Snack s : Snacks.getSnacks()){
            if ((s.getIdSnack() == idSnack) && !snackEncontrado){
                //Agregamos el snack a la lista de productos
                productos.add(s);
                snackEncontrado = true;
                System.out.println("Snack agregado al carrito!");
            }
        }if(!snackEncontrado){
            System.out.println("Id de snack no encontrado: " + idSnack);
        }
    }
    private static void mostrarTicket(List<Snack> productos){
        StringBuilder ticket = new StringBuilder("Productos: \n");
        double total = 0;
        for (Snack s : productos){
            ticket.append("- ").append(s.getNombre()).append(" = $").append(s.getPrecio()).append("\n");
            total += s.getPrecio();
        }
        System.out.println("""
                --- Ticket ---
                """ + ticket + """
                Total = $""" + total);
    }
    private static void agregarSnack(Scanner consola){
        boolean finished = false;

        try{
            System.out.println("Nombre del snack: ");
            Snack s = new Snack();
            s.setNombre(consola.nextLine());
            System.out.println("Precio del snack: ");
            s.setPrecio(Double.parseDouble(consola.nextLine()));
            Snacks.agregarSnack(s);
            finished = true;
        }catch (Exception e){
            System.out.println("Ha ocurrido un error: " + e);
        }finally {
            System.out.println();
        }
        if (finished){
            System.out.println("Snack agregado satisfactoriamente");
        }
    }
}