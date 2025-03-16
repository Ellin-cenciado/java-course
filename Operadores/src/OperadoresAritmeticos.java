public class OperadoresAritmeticos {
    public static void main(String[] args) {
        int a = 5, b = 4, resultado = 0;
        System.out.printf("Valores: a = %d, b = %d",a,b);

        resultado = a+b;
        System.out.println("Suma = "+resultado);
        resultado= a-b;
        System.out.println("Resta = "+resultado);
        resultado=a*b;
        System.out.println("Multiplicacion = "+resultado);
        double aDouble = Double.parseDouble(Integer.toString(a));
        double bDouble = Double.parseDouble(Integer.toString(b));
        double resultadoDoble =aDouble/bDouble;
        System.out.println("Division (a/b) = "+ resultadoDoble);
        resultadoDoble = bDouble/aDouble;
        System.out.println("Division (b/a) = " + resultadoDoble);
        resultado = a/b;
        System.out.println("Division truncada (a/b) = " + resultado);
        resultado = a%b;
        System.out.println("Modulo = " + resultado);

    }


}
