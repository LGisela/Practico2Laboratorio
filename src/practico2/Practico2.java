
package practico2;


public class Practico2 {

    
    public static void main(String[] args) {
        
        Reloj reloj = new Reloj( 2 ,13,"modelotk3",17654);
        
        System.out.println(" la hora es " + reloj.getHora()+ " hs " + " el dia es " + reloj.getDia());
      
        
        reloj.incrementahora();
      
        System.out.println(" la hora actual es : " + reloj.getHora() + " hs " + " el dia es " + reloj.getDia());
          
        
        Persona persona=new Persona( "gisela","leyria",30,1.60,reloj);
         persona.MisDatos();
        persona.Hora();
       persona.comer();
       persona.hablar();
       persona.dia();
       
        
       RelojFit relojFit = new RelojFit(2,15,"modelo fitt", 18546);
    relojFit.contarPasos( 20, 100);
   
    relojFit.frecuenciaAletoria();
        
                
        
    }
    
}
