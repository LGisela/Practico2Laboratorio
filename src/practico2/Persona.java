package practico2;

public class Persona {

    private String nombre;
    private String apellido;
    private int edad;
    private double altura;
    private Reloj reloj;

    public Persona(String nombre, String apellido, int edad, double altura, Reloj reloj) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.altura = altura;
        this.reloj = reloj;
    }

    public String getNombre() {
        return nombre;
    }

    public void comer() {
        System.out.println(nombre + " esta comiendo.");
    }

    public void hablar() {
        System.out.println(nombre + " esta hablando.");
    }

    public int getEdad() {
        return edad;
    }
    
    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void decirHora(Reloj reloj) {
        System.out.println("La hora es: " + reloj.getHora() + " en el dia: " + reloj.getDia());
    }
    public void MisDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Edad: " + edad);
        System.out.println("Altura: " + altura + " metros ");
    }
}
