package practico2;

public class Reloj {

    private int dia;
    private int hora;
    private String modelo;
    private int serie;

    public Reloj(int dia, int hora, String modelo, int serie) {
        this.dia = dia;
        this.hora = hora;
        this.modelo = modelo;
        this.serie = serie;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public void incrementarDia() {
        if (this.dia < 31){
           this.dia++; 
        } else this.dia = 1;
        
    }

    public void incrementahora() {
        this.hora++;
        if (this.hora >= 24) {
            this.hora = 0;
            incrementarDia();
        }
    }

    public void LimpiarPantall() {
        System.out.println("limpiando pantalla");
    }
}
