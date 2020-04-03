package app;

public class Websodio extends Episodio {

    public String url;
@Override
public void reproducir(){

    System.out.println("Reproduciendo websodio"+ " "+nombre+ " " +url);

}

}