
package practico2;

import java.util.Random;


public class RelojFit extends Reloj {

    public RelojFit(int dia, int hora, String modelo, int serie) {
        super(dia, hora, modelo, serie);
    }

  
    public void contarPasos(int x , int y){
        System.out.println(" los pasos desde :  x " + x + " hasta y : " + y);
    }
    
    public void frecuenciaAletoria(){
    Random rand=new Random();
    int frecuencia = rand.nextInt(200);
        System.out.println("frecuencia : " + frecuencia);
    }
}

    
    
  

    

