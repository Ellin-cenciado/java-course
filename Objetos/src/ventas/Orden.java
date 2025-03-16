package ventas;
import ventas.Producto;

import java.util.Arrays;

public class Orden {
    private final int idOrden;
    private Producto[] productos;
    private int contadorProductos;
    private static int contadorOrdenes = 0;
    private static final int MAX_PRODUCTOS = 10;

    public Orden(){
        this.idOrden = ++Orden.contadorOrdenes;
        this.productos = new Producto[MAX_PRODUCTOS];
    }
    public void agregarProducto(Producto producto){
        if(this.contadorProductos > MAX_PRODUCTOS){
            System.out.printf("Se ha llegado al maximo de %d productos",MAX_PRODUCTOS);
            return;
        }else{
            this.productos[this.contadorProductos++] = producto;
        }
    }
    public void quitarProducto(int idProducto) {
        int i = 0; // Index to iterate over the array
        while (i < contadorProductos) {
            if (productos[i].getIdProducto() == idProducto) {
                // Shift elements to the left to remove the current product
                for (int j = i; j < contadorProductos - 1; j++) {
                    productos[j] = productos[j + 1];
                }
                // Nullify the last element (as it's now a duplicate)
                productos[contadorProductos - 1] = null;
                contadorProductos--; // Decrease the count of products
            } else {
                i++; // Only increment if no removal occurs
            }
        }
    }
    public float calcularTotal(){
        float total = 0;
        for (int i = 0; i < contadorProductos; i++){
            total += this.productos[i].getPrecio();
        }
        return total;
    }
    public String mostrarOrden(){
        var ordenString = new StringBuilder("Orden{");
        for (int i = 0; i < contadorProductos; i++){
            if(i == contadorProductos-1){
                ordenString.append(productos[i].toString());
            }else {
                ordenString.append(productos[i].toString()).append(", ");
            }
        }
        ordenString.append("}");
        return ordenString.toString();
    }
}
