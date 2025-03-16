public class ManejoSubcadenas {
    public static void main(String[] args) {
        var original = "Hola mundo";
        System.out.println("original = " + original);

        var subcadena1 = original.substring(0,4);
        System.out.println("subcadena1 = " + subcadena1);
        var subcadena2 = original.substring(4,10);
        System.out.println("subcadena2 = " + subcadena2);
    }
}
