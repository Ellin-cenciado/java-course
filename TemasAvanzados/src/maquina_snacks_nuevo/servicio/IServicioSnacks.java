package maquina_snacks_nuevo.servicio;

import maquina_snacks_nuevo.dominio.Snack;
import java.util.List;


public interface IServicioSnacks {
    void agregarSnack(Snack snack);
    void quitarSnack(int idSnack);
    void mostrarSnacks();
    List<Snack> getSnacks();
}
