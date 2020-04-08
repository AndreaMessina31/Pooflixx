package app;

/**
 * Episodio
 */
public class Episodio {

    private double duracion;

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;

    }

    private String nombre;

    public String getNombre() {
        return nombre;

    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    private int numero;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Episodio() {
        this.duracion = 40;

    }

    public Episodio(final int numero, final String nombre, final double duracion) {
        this.numero = numero;
        this.nombre = nombre;
        this.duracion = duracion;
    }

    public void reproducir() {
        System.out.println("Reproduciendo episodio " + this.numero + " " + this.nombre);
    }

}