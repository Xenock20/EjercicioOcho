public class Main {
    public static void main(String[] args) {
        //Inicializacion del objeto

        Persona persona = new Persona();

        persona.setNombre("Pepito");
        persona.setEdad(16);
        persona.setTelefono("+52-021-32403240-33");

        System.out.println("Se llama " + persona.getNombre() + " tiene " + persona.getEdad() + " y su numero de telefono es " + persona.getTelefono());
    }
}

class Persona{

    //Variables
    private String nombre;
    private int edad;
    private String telefono;

    //set y get de cada variable
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
        return this.nombre;
    }

    public void setEdad(int edad){
        this.edad = edad;
    }

    public int getEdad(){
        return this.edad;
    }

    public void setTelefono(String telefono){
        this.telefono = telefono;
    }

    public String getTelefono(){
        return this.telefono;
    }
}