package persona;

public class Persona {
    //Todas las clases extienden la clase object

    private static int contadorPersonas = 0;
    private String nombre;
    private String apellido;
    private int idPersona;

    public Persona(String nombre, String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
        this.idPersona = ++Persona.contadorPersonas;
    }
    public Persona(){
        this.nombre = "John";
        this.apellido = "Doe";
        this.idPersona = ++Persona.contadorPersonas;
    }

    public void mostrarPersona(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
    }
    @Override
    //Voy a reescribir la el metodo toString
    public String toString(){
        return "Id: "+ this.idPersona + ", "+ nombre + " " + apellido + " "  + super.toString();
    }

    public static int getContadorPersonas(){return Persona.contadorPersonas;}
    public int getIdPersona(){return this.idPersona;}
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getApellido(){
        return apellido;
    }
    public void setApellido(String apellido){
        this.apellido = apellido;
    }

}
