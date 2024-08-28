package practico2;

public class Practico2 {

    public static void main(String[] args) {

        //Desde la java main class, llamar a los metodos de unReloj, accediendo desde objeto unaPersona
        
        Reloj reloj = new Reloj(2, 13, "modelotk3", 17654);

        Persona persona = new Persona("gisela", "leyria", 30, 1.60, reloj);

        persona.decirHora(reloj);

        persona.MisDatos();
        persona.comer();
        persona.hablar();

        
        
        RelojFit relojFit = new RelojFit(2, 15, "modelo fitt", 18546);
        relojFit.contarPasos(20, 100);
        relojFit.frecuenciaAletoria();
    }

}
