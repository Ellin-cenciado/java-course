public class Excepciones {
    public static void main(String[] args) {
        int valor1 = 10, valor2 = 0;
        try{
          var resultado = valor1/valor2;
    } catch (Exception e) {
            System.out.println("Division por 0");
            System.out.println(e);
            throw new RuntimeException(e);
        }
    }
}
