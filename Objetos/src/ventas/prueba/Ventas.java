package ventas.prueba;
import ventas.Producto;
import ventas.Orden;
public class Ventas {
    public static void main(String[] args) {
        var producto1 = new Producto("Mayonesa",3000);
        var producto2 = new Producto("Salsa",3000);
        var producto3 = new Producto("Savora",2000);
        var orden1 = new Orden();
        orden1.agregarProducto(producto1);
        orden1.agregarProducto(producto1);
        orden1.agregarProducto(producto2);
        orden1.agregarProducto(producto3);
        orden1.quitarProducto(1);
        System.out.println(orden1.mostrarOrden());
        System.out.println(orden1.calcularTotal());
    }
}
