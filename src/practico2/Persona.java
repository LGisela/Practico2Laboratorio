
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    
    public void Hora(){
        System.out.println("la Hora es : " +reloj.getHora());
    
    }
    public void dia(){
        System.out.println(" hoy es : " + reloj.getDia());
    
    }
public void comer(){
}


public void hablar() {
 
 
 
 } 
public void MisDatos(){
    System.out.println(" nombre " + nombre);;
    System.out.println(" Apellido " + apellido);;  
     System.out.println(" edad " + edad);
     
     System.out.println(" altura " + altura + " metros ");
     
}
}
