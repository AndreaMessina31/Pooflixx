package app;

import java.util.ArrayList;
import java.util.List;

/**
 * Potflix
 */
public class Potflix {

    String titulo;
    String actor;
    String buscarPorTitulo;
    String buscarPelicula;
    String buscarSerie;

    public List<Pelicula> peliculas = new ArrayList<>();
    public List<Serie> series = new ArrayList<>();

    public Contenido buscarPorTitulo(String titulo) {
        return null;
    }

    public Serie buscarSerie(String titulo) {
        for (Serie s : this.series) {
            if (s.titulo.equals(titulo))
                return s;
        }
        return null;
    }

    public Pelicula buscarPelicula(String titulo) {
        return null;
    }

    public Serie buscarSerie(Actor actor) {
        return null;
    }

    public void inicializarCatalogo() {
        this.agregarBreakingBad();
        this.agregarWalkingDead();
    }

    public void agregarBreakingBad() {

        Serie breakingB = new Serie();
        breakingB.titulo = "Breaking Bad";

        Genero genero = new Genero();
        genero.nombre = "Drama";
        breakingB.generos.add(genero);

        Temporada t5 = new Temporada();
        t5.numero = 5;

        Episodio ep = new Episodio();
        ep.numero = 7;
        ep.nombre = "Say my name";
        ep.duracion = 43;
        t5.episodios.add(ep);

        Episodio epOtro = new Episodio();
        epOtro.numero = 5;
        epOtro.nombre = "Ozymandias";
        epOtro.duracion = 41;

        t5.episodios.add(epOtro);
        breakingB.temporadas.add(t5);
        this.series.add(breakingB);

    }

    public void agregarWalkingDead() {

        Serie walkingD = new Serie();
        walkingD.titulo = "Walking Dead";

        Genero genero = new Genero();
        genero.nombre = "Ficción post-apocaliptica";
        walkingD.generos.add(genero);

        Temporada t1 = new Temporada();
        t1.numero = 1;

        Episodio ep = new Episodio();
        ep.numero = 1;
        ep.nombre = "Days gone bye";
        ep.duracion = 43;
        t1.episodios.add(ep);

        Episodio epOtro = new Episodio();
        epOtro.numero = 2;
        epOtro.nombre = "Guts";
        epOtro.duracion = 43;
        t1.episodios.add(epOtro);


        //WEBSODIO
        Websodio websodio =new Websodio();
        websodio.nombre="Hola";
        websodio.numero=3;
        websodio.duracion=15;
        websodio.url= "http:/hola.com";
        t1.episodios.add(websodio);
        //

        Temporada t2 = new Temporada();
        t2.numero = 2;

        Episodio ep1 = new Episodio();
        ep1.numero = 1;
        ep1.nombre = "What lies ahead ";
        ep1.duracion = 43;
        t2.episodios.add(ep1);

        Episodio epOtro1 = new Episodio();
        epOtro1.numero = 2;
        epOtro1.nombre = "Bloodletting";
        epOtro1.duracion = 43;
        t2.episodios.add(epOtro1);

//importante!!!
        walkingD.temporadas.add(t1);
        walkingD.temporadas.add(t2);
        this.series.add(walkingD);
    }

}
