public interface Traductor {
    //public y abstract si no especificamos nada
    void traducir();

    //Metodos con implementacion por default
    default void iniciarTraductor(){
        System.out.println("Iniciando traductor..");
    }
}

class Ingles implements Traductor{
    @Override
    public void traducir() {
        System.out.println("Traduciendo al Ingles..");
    }
}
class Frances implements Traductor{
    @Override
    public void traducir(){
        System.out.println("Traduciendo al Frances..");
    }

    public void iniciarTraductor() {
        System.out.println("Iniciando traductor al Frances..");
    }
}
class PruebaTraductor{
    public static void main(String[] args) {
        Traductor inges = new Ingles();
        inges.iniciarTraductor();
        inges.traducir();
        Traductor fances = new Frances();
        fances.iniciarTraductor();
        fances.traducir();
    }
}