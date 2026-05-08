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
                //1) si prepara
                sleep(2000);
                //acquisisce in base al tipo
                if (type == TipoVolo.NAZIONALE) {
                    aeroporto.acquisisciGateNazionle(this);
                }
                //vola
                sleep(4500);
                //rilascia
                //TODO: if sul tipo e richiamo del metodo relativo :)
                if (type == TipoVolo.NAZIONALE) {
                    aeroporto.rilasciaGateNazionle(this);
                }
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
