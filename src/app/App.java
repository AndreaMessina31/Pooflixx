package app;

public class App {
    public static void main(String[] args) throws Exception {

        Potflix miPotflix = new Potflix();

        System.out.println("Inicializando Catalogo");

        miPotflix.inicializarCatalogo();

        Serie bb = miPotflix.buscarSerie("Walking Dead");

        Temporada laMejorTemporada = bb.getTemporada(1);

        Episodio elTop;

        elTop = laMejorTemporada.getEpisodio(3);

        elTop.reproducir();
    }

}