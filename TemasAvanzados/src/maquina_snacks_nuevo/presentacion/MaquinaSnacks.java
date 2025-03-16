package maquina_snacks_nuevo.presentacion;

import maquina_snacks_nuevo.dominio.Snack;
import maquina_snacks_nuevo.servicio.IServicioSnacks;
import maquina_snacks_nuevo.servicio.ServicioSnacksArchivos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MaquinaSnacks {
    public static void main(String[] args) {
        maquinaSnacks();
    }

    public static void maquinaSnacks(){
        boolean salir = false;
        Scanner consola = new Scanner(System.in);

        //Creamos el objeto para obtener el servicio de snacks

        IServicioSnacks servicioSnacks = new ServicioSnacksArchivos();

        List<Snack> productos = new ArrayList<>();
        System.out.println("---Maquina de snacks---");
        servicioSnacks.mostrarSnacks();

        while (!salir) {
            try{
                int opcion = mostrarMenu(consola);
                salir = ejecutarOpciones(servicioSnacks,opcion,consola,productos);
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
                4) Quitar snack
                5) Mostrar Snacks
                6) Salir
                Elije una opcion:\s""");
        return Integer.parseInt(consola.nextLine());
    }
    private static boolean ejecutarOpciones(IServicioSnacks servicioSnacks,int opcion, Scanner consola,
                                            List<Snack> productos){
        var salir = false;
        switch(opcion){
            case 1 -> comprarSnack(servicioSnacks,consola,productos);
            case 2 -> mostrarTicket(productos);
            case 3 -> agregarSnack(servicioSnacks, consola);
            case 4 -> quitarSnack(servicioSnacks,consola);
            case 5 -> listarInventarioSnacks(servicioSnacks);
            case 6 -> {
                System.out.println("Gracias por venir, Vuelva pronto!");
                salir = true;
            }
            default -> System.out.println("Opcion invalida! " + opcion);
        }
        return salir;
    }

    private static void comprarSnack(IServicioSnacks servicioSnacks,Scanner consola,List<Snack> productos){
        System.out.println("Que snack quieres comprar? ");
        servicioSnacks.mostrarSnacks();
        int idSnack = Integer.parseInt(consola.nextLine());
        //Validar que el snack existe
        var snackEncontrado = false;
        for(Snack s : servicioSnacks.getSnacks()){
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
    private static void agregarSnack(IServicioSnacks servicioSnacks, Scanner consola){
        boolean finished = false;

        try{
            System.out.println("Nombre del snack: ");
            Snack s = new Snack();
            s.setNombre(consola.nextLine());
            System.out.println("Precio del snack: ");
            s.setPrecio(Double.parseDouble(consola.nextLine()));
            servicioSnacks.agregarSnack(s);
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

    private static void quitarSnack(IServicioSnacks servicioSnacks, Scanner consola){
        try{
            System.out.println("Proporcione el id del snack a quitar:");
            int eraseId = Integer.parseInt(consola.nextLine());
            System.out.println("Eliminando snack...");
            servicioSnacks.quitarSnack(eraseId);
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error eliminando el snack: " + e.getMessage());
        }finally {
            System.out.println();
            servicioSnacks.mostrarSnacks();
        }
    }

    private static void listarInventarioSnacks(IServicioSnacks servicioSnacks){
        servicioSnacks.mostrarSnacks();
    }
}