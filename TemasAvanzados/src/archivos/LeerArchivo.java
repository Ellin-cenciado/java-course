package archivos;

import java.io.*;

public class LeerArchivo {
    public static void main(String[] args) {
        var nombreArchivo = "mi_archivo.txt";

        try{
            System.out.println("Contenido del archivo: ");
            var salida = new BufferedReader(new FileReader(nombreArchivo));
            var linea = salida.readLine();

            while (linea != null){
                System.out.println(linea);
                linea = salida.readLine();
            }
            salida.close();
        }catch (IOException e){
            System.out.println("Ha ocurrido un error leyendo el archivo" + e);
        }
    }
}
