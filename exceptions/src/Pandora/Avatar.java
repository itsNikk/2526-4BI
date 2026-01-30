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

    public void attacca(PostazioneRDA postazioneRDA) throws DifesaInsufficienteException, ArmaMalfunzionanteException, AttccoFallitoException {
        double prob = r.nextDouble();

        if (prob <= 0.5) {
            //l'avatar attacca ma solo sen on ha problemi con l'arma.
            double weaponFailure = r.nextDouble();
            if (weaponFailure <= 0.3) {
                throw new ArmaMalfunzionanteException("L'arma di " + this.nome + " non funziona.");
            } else postazioneRDA.riceviDanno(forzaAttaco);
        } else throw new AttccoFallitoException(nome + " non attacca.");
    }
}
