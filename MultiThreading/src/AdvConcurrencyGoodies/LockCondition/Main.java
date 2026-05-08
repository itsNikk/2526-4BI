package AdvConcurrencyGoodies.LockCondition;

public class Main {
    private static final int GATE_NAZIONALI = 3;
    private static final int GATE_INTERNAZIONALI = 2;

    public static void main(String[] args) throws InterruptedException {
        //ALT+ENTER
        Aeroporto aeroporto = new Aeroporto(GATE_NAZIONALI, GATE_INTERNAZIONALI);

        Volo[] voli = {
                new Volo("nex-01", aeroporto, TipoVolo.NAZIONALE),
                new Volo("nex-02", aeroporto, TipoVolo.NAZIONALE),
                new Volo("nex-03", aeroporto, TipoVolo.NAZIONALE),
                new Volo("nex-04", aeroporto, TipoVolo.NAZIONALE),
                new Volo("nex-05", aeroporto, TipoVolo.NAZIONALE),
                new Volo("nex-066", aeroporto, TipoVolo.INTERNAZIONALE),
                new Volo("nex-0779", aeroporto, TipoVolo.INTERNAZIONALE),
        };

        for (Volo v : voli) v.start();
        for (Volo v : voli) v.join();

        System.out.println("END");
    }
}
