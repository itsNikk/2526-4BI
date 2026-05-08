package AdvConcurrencyGoodies.LockCondition;

import java.security.PublicKey;

public class Volo extends Thread {

    private static final int MAX_ITERATION = 2;
    private Aeroporto aeroporto;
    private TipoVolo type;

    public Volo(String name, Aeroporto aeroporto, TipoVolo type) {
        this.aeroporto = aeroporto;
        this.type = type;
        setName(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < MAX_ITERATION; i++) {
            try {
                //1) si prepara (con math random ovviamente)
                System.out.println(getName() + " si prepara.");
                sleep(2000);
                //acquisisce in base al tipo
                if (type == TipoVolo.NAZIONALE) {
                    System.out.println(getName() + " richiede gate nazionale");
                    aeroporto.acquisisciGateNazionle(this);
                }
                //vola
                System.out.println(getName() + "imbarca...");
                sleep(4500);
                //rilascia
                //TODO: if sul tipo e richiamo del metodo relativo :)
                if (type == TipoVolo.NAZIONALE) {
                    System.out.println(getName() + " rilascia gate nazionale");
                    aeroporto.rilasciaGateNazionle(this);
                }
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
