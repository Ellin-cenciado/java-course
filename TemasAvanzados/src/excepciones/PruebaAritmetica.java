package excepciones;
import excepciones.Aritmetica;

public class PruebaAritmetica {
    public static void main(String[] args) {
        try {
            System.out.println(Aritmetica.division(5,2));
        }catch(Exception e){
            System.out.println("Ocurrio un error: " + e);
        }finally {
            System.out.println("Se reviso la division entre 0");
        }
    }
}
