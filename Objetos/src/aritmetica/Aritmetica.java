package aritmetica;

public class Aritmetica {
    private int _operando1;
    private int _operando2;

    public Aritmetica(){
        System.out.println("Ejecutando constructo vacio");
        _operando1 = 2;
        _operando2 = 3;
        System.out.println("Operador this: "+this);
    }

    public Aritmetica(int op1, int op2){
        System.out.println("Ejecutando contructor");
        this._operando1 = op1;
        this._operando2 = op2;
        System.out.println("Operador this: "+ this);
    }

    public void sumar(){
        var resultado = _operando1 + _operando2;
        System.out.println("resultado = " + resultado);
    }
    public void restar(){
        var resultado = _operando1 - _operando2;
        System.out.println("resultado = " + resultado);
    }
    public void multiplicar(){
        var resultado = _operando1 * _operando2;
        System.out.println("resultado = " + resultado);
    }
    public void dividir(){
        float resultado = (float)_operando1 / (float) _operando2;
        System.out.println("resultado = " + resultado);
    }
    public int getOperando1(){
        return this._operando1;
    }
    public void setOperando1(int operando1){
        this._operando1 = operando1;
    }
    public int getOperando2(){
        return this._operando2;
    }
    public void setOperando2(int operando2){
        this._operando2 = operando2;
    }
}
