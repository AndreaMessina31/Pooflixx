package app;

import java.util.ArrayList;
import java.util.List;

/**
 * Contenido
 */
public class Contenido {

    public String titulo;
    public List<String> premios;
    public Director director;
    public double tiempoVisto;
    public List<Genero> generos = new ArrayList<>();
    public List<Actor> actores = new ArrayList<>();

    public boolean Visto() {

        return false;

    }

    public void Reproducir() {
        System.out.println("Reproduciendo" + this.titulo);

    }

    public void Pausar() {
        System.out.println("Pausando" + this.titulo);
    }

}
