package aritmetica.prueba;

import aritmetica.Aritmetica;

public class PruebaAritmetica {
    public static void main(String[] args) {
        var aritm = new Aritmetica(5,7);
        //aritm.operando1 = 2;
        //aritm._operando2 = 3;
        System.out.println("Dir. mem. aritm: " + aritm);
        aritm.sumar();
        aritm.restar();
        aritm.multiplicar();
        aritm.dividir();


        System.out.println("\nAritmetica vacia");
        var vacio = new Aritmetica();
        System.out.println("Dir. mem. vacio: " + vacio);
        vacio.sumar();
        vacio.restar();
        vacio.multiplicar();
        vacio.dividir();

        vacio.setOperando1(6);
        System.out.println("Nuevo valor de vacio._operando1: " +  vacio.getOperando1());

    }
}
