package archivos;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class LeerTodo {
    public static void main(String[] args) {
        var nombreArchivo = "mi_archivo.txt";
        try{
            //Leer todas las lineas de archivo
            List<String> lineas = Files.readAllLines(Paths.get(nombreArchivo));
            System.out.println("Contenido del archivo: ");
            System.out.println(lineas);
            lineas.forEach(System.out::println);
        }catch (Exception e){
            System.out.println("Error al leer el archivo: " + e);
            e.printStackTrace();
        }
    }
}
