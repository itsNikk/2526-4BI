package sportello04022026;

import java.util.Random;

public class MacchinarioDiagnostico {
    private String name;
    private final double faultProb;
    private Random rnd;

    public MacchinarioDiagnostico(String name, double faultProb) {
        this.name = name;
        this.faultProb = faultProb;
        this.rnd = new Random();
    }

    //TODO: doExam(Paziente p) -> se il macchinario si guasta.. exception... altrimenti messaggio
    public void doExam(Paziente paziente) throws EsameFallitoException {
        //Estrarre la prob
        if (rnd.nextDouble() < faultProb) {
            throw new EsameFallitoException("Esame fallito su " + name + ". motivo: maccinario guasto");
        }
    }

}
