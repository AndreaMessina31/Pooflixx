package app;

/**
 * Episodio
 */
public class Episodio {

    public double duracion;
    public String nombre;
    public int numero;

    public void reproducir() {
        System.out.println("Reproduciendo episodio "+this.numero+ " " +this.nombre);
    }

}