public class BusquedaSubcadenas {
    public static void main(String[] args) {
        //Buscar Subcadenas
        //indexOf - Devuelve el indice de la primera aparicion de la subcadena
        var cadena1 = "Hola Mundo Hola";
        System.out.println("cadena1: " + cadena1);
        var indice1 = cadena1.indexOf("Mundo");
        System.out.println("Indice mundo: "+indice1);
        var ultindice = cadena1.lastIndexOf("Hola");
        System.out.println("indice del ultimo hola: " + ultindice);
        //Subcadena no encontrada devuelve -1
        var indice3 = cadena1.indexOf("Java");
        System.out.println("Cadena no encontrada: " + indice3);
    }
}
