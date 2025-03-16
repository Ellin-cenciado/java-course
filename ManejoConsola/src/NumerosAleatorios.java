import java.util.Random;

public class NumerosAleatorios {
    public static void main(String[] args) {
        System.out.println("Numeros Aleatorios");

        var random = new Random();
        var numeroAleatorio = random.nextInt(10);

        System.out.println("\tNumero generado: "+numeroAleatorio);

        //Generar un flotante
        var floatAleatorio = random.nextFloat(1);
        System.out.println("\tFloat generado: "+floatAleatorio);
        
    }
}
