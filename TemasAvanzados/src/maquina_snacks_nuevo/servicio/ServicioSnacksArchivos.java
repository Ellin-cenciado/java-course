package maquina_snacks_nuevo.servicio;

import maquina_snacks_nuevo.dominio.Snack;


import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ServicioSnacksArchivos implements IServicioSnacks{

    private final String NOMBRE_ARCHIVO = "snacks.txt";
    //Crear la lista de snacks

    private List<Snack> snacks = new ArrayList<>();

    //Constructor clase
    public ServicioSnacksArchivos(){
        var archivo = new File(NOMBRE_ARCHIVO);
        var existe = false;
        try{
            existe = archivo.exists();
            if(existe){ //Leemos el archivo si es que existe
                System.out.println("Archivo encontrado, leyendo...");
                this.snacks = obtenerSnacks();
            }
            else{ //Si no creamos el archivo
                var salida = new PrintWriter(new FileWriter(archivo));
                salida.close(); //Guarda el archivo en disco
                System.out.println("Se ha creado el archivo.");
                cargarSnacksIniciales();
            }
        } catch (Exception e) {
            System.out.println("Error al crear el archivo: " + e.getMessage());
        }

    }

    private List<Snack> obtenerSnacks(){
        List<Snack> snack = new ArrayList<>();

        try{
            //Preparo la primera linea a leer en snacks.txt
            var salida = new BufferedReader(new FileReader(NOMBRE_ARCHIVO));
            var linea = salida.readLine();

            String[] lineaSplit;

            //Por cada linea del archivo, se va a hacer el mismo proceso

            while(linea != null){
                //Divido la primera linea en cada coma y guardo cada parte en un array.
                //Ej: 1,Coca cola,2500.0 => ["1","Coca cola","2500.0"]
                lineaSplit = linea.split(",");

                //Creo un snack y pongo lo del indice 1 en el nombre, y lo del indice 2 en precio
                Snack s = new Snack(lineaSplit[1],Double.parseDouble(lineaSplit[2]));
                snack.add(s);//Agrego a la lista
                linea = salida.readLine();//Siguiente linea
            }
            salida.close();
        }catch (Exception e){
            System.out.println("Error intentando leer el archivo: " + e.getMessage());
        }
        return snack;
    }


    private void cargarSnacksIniciales(){
        this.agregarSnack(new Snack("Chocolate blanco",2000));
        this.agregarSnack(new Snack("Coca cola",2500));
        this.agregarSnack(new Snack("Jugo de Naranja",1500));

    }

    @Override
    public void agregarSnack(Snack snack) {
        //1. Se guarda en la lista en memoria
        this.snacks.add(snack);
        //2. Se guarda en el archivo
        this.agregarSnackArchivo(snack);

    }

    private void agregarSnackArchivo(Snack snack){
        boolean anexar;
        var archivo = new File(NOMBRE_ARCHIVO);
        try{
            anexar = archivo.exists(); //Si el archivo existe, entonces los nuevos snacks se concatenan
            var salida = new PrintWriter(new FileWriter(archivo,anexar));
            salida.println(snack.escribirSnack()); //TODO: revisar el metodo toString
            salida.close();
        } catch (Exception e) {
            System.out.println("Error al agregar snack: " + e.getMessage());
        }
    }

    @Override
    public void quitarSnack(int idSnack) {
        if (snacks == null) {
            System.out.println("La lista de snacks no está inicializada.");
            return;
        }

        boolean encontrado = false;
        for (int i = 0; i < snacks.size(); i++) {
            if (snacks.get(i).getIdSnack() == idSnack) {
                snacks.remove(i);
                System.out.println("Snack removido satisfactoriamente");
                encontrado = true;
                escribirAlArchivo();
                break;
            }
        }

        if (!encontrado) {
            System.out.println("No se encontró ningún snack con el ID proporcionado.");
        }
    }

    private void escribirAlArchivo(){
        var archivo = new File(NOMBRE_ARCHIVO);
        try{
            var salida = new PrintWriter(new FileWriter(archivo));

            for (var snack: this.snacks){
                salida.println(snack.escribirSnack());
            }
            salida.close();
        } catch (Exception e) {
            System.out.println("Error al agregar snack: " + e.getMessage());
        }
    }

    @Override
    public void mostrarSnacks() {

        if (snacks.isEmpty()){
            System.out.println("No hay snacks en el inventario..");
        }else {

            System.out.println("--- Snacks en el inventario ---");
            StringBuilder inventarioSnacks = new StringBuilder();
            for (var snack : this.snacks) {
                inventarioSnacks.append(snack.toString()).append("\n");
            }
            System.out.println(inventarioSnacks);
        }
    }

    @Override
    public List<Snack> getSnacks() {
        return snacks;
    }
}
