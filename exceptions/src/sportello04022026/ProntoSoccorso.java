package sportello04022026;

import java.util.ArrayList;

public class ProntoSoccorso {
    private ArrayList<Medico> medics;
    private ArrayList<Paziente> pazienti;
    private ArrayList<MacchinarioDiagnostico> macchinarioDiagnostici;
    private ArrayList<SalaOperatoria> saleOperatorie;

    public ProntoSoccorso() {
        this.medics = new ArrayList<>();
        this.saleOperatorie = new ArrayList<>();
        this.pazienti = new ArrayList<>();
        this.macchinarioDiagnostici = new ArrayList<>();
    }

    public void addMedic(Medico m) {
        medics.add(m);
    }

    public void addSalaOperatoria(SalaOperatoria s) {
        saleOperatorie.add(s);
    }
}
