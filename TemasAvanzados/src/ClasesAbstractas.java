public class ClasesAbstractas {
    public static void main(String[] args) {
    //FiguraGeometrica figuraGeometrica = new FiguraGeometrica();
    //FiguraGeometrica cannot be instantiated because it's an abstract object
    Rectangulo rectangulo = new Rectangulo();
    rectangulo.dibujar();
    }
}

//Clase abstracta

abstract class FiguraGeometrica{ //No se puede instanciar
    public abstract void dibujar();
}

class Rectangulo extends FiguraGeometrica{
    @Override
    public void dibujar(){
        System.out.println("[]");
    }
}