package ventas;

public class Producto {
    private static int contadorProductos = 0;
    private String nombre;
    private float precio;
    private final int idProducto;

    public Producto(String nombre, float precio){
        this.nombre = nombre;
        this.precio = precio;
        this.idProducto = ++Producto.contadorProductos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public int getIdProducto() {
        return this.idProducto;
    }

    @Override
    public String toString(){
        return "Producto{"+
                "idProducto = " + this.idProducto +
                ", nombre = '"+ this.nombre +'\'' +
                ", precio = $" + this.precio + "}";
    }
}
