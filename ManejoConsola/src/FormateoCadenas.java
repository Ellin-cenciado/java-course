public class FormateoCadenas {
    public static void main(String[] args) {
        var nombre = "Matias";
        var edad = 35;
        var salario = 2100.5;

        var mensaje = String.format("Nombre: %s\nEdad: %d\nSalario: $%.2f",nombre,edad,salario);

        System.out.println(mensaje);
        var numeroEmpleado = 12;
        //Formateo text block
        mensaje = """
                %nDetalle persona.prueba.PruebaPersona:\s
                -------------------
                \tNombre: %s
                \tNumero Empleado: %04d
                \tEdad: %d
                \tSalario: $%.2f
                """.formatted(nombre,numeroEmpleado,edad,salario);

        System.out.println(mensaje);
    }
}
