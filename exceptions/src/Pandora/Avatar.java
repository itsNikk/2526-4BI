package Pandora;

import java.util.Random;

public class Avatar {
    private String nome;
    private Arma arma;
    private int forzaAttaco;
    private Random r;


    public Avatar(String nome, Arma arma, int forzaAttaco) {
        this.nome = nome;
        this.arma = arma;
        this.forzaAttaco = forzaAttaco;
        this.r = new Random();
    }

    public void attacca(PostazioneRDA postazioneRDA) throws ArmaMalfunzionanteException{
        double prob = r.nextDouble();

        if (prob <= 0.5) {
            //l'avatar attacca
        } else throw new ArmaMalfunzionanteException("L'arma "+arma+" di "+nome+ " non funziona");
    }
}
