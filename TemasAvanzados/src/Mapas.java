import java.util.HashMap;
import java.util.Map;

public class Mapas {
    public static void main(String[] args) {
        Map<String,String> persona = new HashMap<String,String>();
        persona.put("Nombre","Pedro");
        persona.put("Apellido","Perez");
        persona.put("Edad","31");
        persona.entrySet().forEach(System.out::println);
        persona.put("Edad","35");
        System.out.println("\nNuevos valores de persona:");
        persona.entrySet().forEach(System.out::println);

    //Iterar sobre elementos por separado
        System.out.println("\nIterar por separado\n     Llaves: ");
        persona.forEach((key, value) -> System.out.println(key));
        System.out.println("    Valores:");
        persona.forEach((key,value) -> System.out.println(value));
    }
}
