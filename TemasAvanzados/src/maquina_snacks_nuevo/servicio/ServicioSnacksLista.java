package maquina_snacks_nuevo.servicio;

import maquina_snacks_nuevo.dominio.Snack;

import java.util.ArrayList;
import java.util.List;

public class ServicioSnacksLista implements IServicioSnacks {
    private static final List<Snack> snacks;
    private static int contadorSnack = 4;
    //Bloque static inicializador
    static{
        snacks = new ArrayList<Snack>();
        snacks.add(new Snack("Papas",1300));
        snacks.add(new Snack("Chocolate",3000));
        snacks.add(new Snack("Chocolate blanco", 2400));
        snacks.add(new Snack("Jugo de naranja",1500));
    }

    public void agregarSnack(Snack snack){
        snacks.add(snack);
        contadorSnack++;
        System.out.println("Agregado snack: " + snack.toString());
    }
    public void quitarSnack(int idSnack){
        int i = 0;
        while (i < contadorSnack){
            if (idSnack == snacks.get(i).getIdSnack()){

                for (int j = i; j < contadorSnack -1; j++){
                    snacks.set(j,snacks.get(j+1));
                }
                snacks.set(contadorSnack-1,null);
                contadorSnack--;
            }else {
                i++;
            }
        }
    }
    public void mostrarSnacks(){
        StringBuilder inventarioSnacks = new StringBuilder("---Inventario de snacks---");
        for (Snack s : snacks){
            inventarioSnacks.append(s.toString()).append("\n");
        }
        System.out.println(inventarioSnacks);
    }

    public List<Snack> getSnacks(){
        return snacks;
    }
}
