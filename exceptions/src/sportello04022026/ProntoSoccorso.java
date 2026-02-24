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

    public void gestisciArrivo(Paziente paziente) throws NessunMedicoDisponibileException {

        pazienti.add(paziente);

        //TODO: 1. se c'è un medico disponibile... assegnagnelo
        // se nessuno è disponibile eccezione (medico non disponibile exception)
        if (medics.isEmpty())
            throw new NessunMedicoDisponibileException("Nessun medico per " + paziente.getName());

        boolean assegnato = false;
        for (Medico m : medics) {
            if (!m.isBusy()) {
                m.assegnaPaziente(paziente);
                assegnato = true;
                break;
            }
        }

        if (!assegnato)
            throw new NessunMedicoDisponibileException("Nessun medico disponibile per " + paziente.getName());


    }

    public void addMacchinario(MacchinarioDiagnostico m) {
        macchinarioDiagnostici.add(m);
    }

    public void addPaziente(Paziente p) {
        pazienti.add(p);
    }

    public void addMedic(Medico m) {
        medics.add(m);
    }

    public void addSalaOperatoria(SalaOperatoria s) {
        saleOperatorie.add(s);
    }
}
