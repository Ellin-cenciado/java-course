public class GeneradorEmails {
    public static void main(String[] args) {

        var nombreCompleto = new String("Juan Perez");
        var empresa = new String("Perez Reparaciones");
        var dominio = new String(".com.ar");

        var email = new String().concat((
                nombreCompleto.replace(" ",".") + "@"
                + empresa + dominio).toLowerCase().replace(" ", "")
        );
        System.out.println("Email generado: " + email);
    }
}
