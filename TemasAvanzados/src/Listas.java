import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Listas {
    public static void main(String[] args) {
        List<String> miLista = new ArrayList<>();
        miLista.add("Lunes");
        miLista.add("Martes");
        miLista.add("Miercoles");
        miLista.add("Jueves");
        miLista.add("Viernes");
        miLista.add("Sabado");
        miLista.add("Domingo");
        //miLista.add("Domingo"); Admite elementos duplicados

//        for (String diaSemana : miLista){
//            System.out.println("diaSemana = " + diaSemana);
//        }

        //funcion lambda
//        miLista.forEach(elemento -> {
//            System.out.println("Elemento: " + elemento.toLowerCase());
//        });

        miLista.forEach(System.out::println);

        List<String> nombres = Arrays.asList("Juan","Pedro","Pico");
        System.out.println("\nNombres: ");
        nombres.forEach(System.out::println);
    }
}
