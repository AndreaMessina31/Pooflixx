package app;

import java.util.ArrayList;
import java.util.List;

/**
 * Temporada
 */
public class Temporada {

    public List<Episodio> episodios = new ArrayList<>();

    public int numero;

    public Episodio getEpisodio(int nro) {

for(Episodio epi : this. episodios){
    if(epi.numero == nro){
        return epi;
    }
    
}

return null;

       
    }

} 