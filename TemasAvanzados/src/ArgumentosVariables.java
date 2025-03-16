public class ArgumentosVariables {
    public static void main(String[] args) {
        //imprimirNumeros(1,2,3,4);
        variosParametros("Juan",10,30,20);
    }

    private static void imprimirNumeros(int...numeros) {
        for(int i = 0; i<numeros.length; i++){
            System.out.print(numeros[i] + " ");
        }
    }
    private static void variosParametros(String nombre, int... numeros){
        System.out.println("Nombre: " + nombre);
        imprimirNumeros(numeros);
    }
}
