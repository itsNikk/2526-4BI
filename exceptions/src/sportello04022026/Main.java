package sportello04022026;

import java.awt.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ProntoSoccorso ps = new ProntoSoccorso();

        //Genero M medici
        for (int i = 0; i < 3; i++) {
            Medico m = new Medico("Medico-" + (i + 1));
            ps.addMedic(m);
        }

        //Generate S sale
        for (int i = 0; i < 2; i++) {
            SalaOperatoria s = new SalaOperatoria(i + 1);
            ps.addSalaOperatoria(s);
        }

        //Generate 3 macchinari
        MacchinarioDiagnostico tac = new MacchinarioDiagnostico("TAC", 0.25);
        MacchinarioDiagnostico radiografia = new MacchinarioDiagnostico("Radiographia", 0.10);
        ps.addMacchinario(tac);
        ps.addMacchinario(radiografia);

        Paziente p1 = new Paziente("Gianpaolo Rossi", "ROSSO");
        Paziente p2 = new Paziente("Gianpaolo Bianchi", "BIANCO");
        Paziente p3 = new Paziente("Andrea Gian Gialli", "GIALLO");
        Paziente p4 = new Paziente("Luca Verdi", "VERDE");

        ArrayList<Paziente> pazientiInArrivo = new ArrayList<>();
        pazientiInArrivo.add(p1);
        pazientiInArrivo.add(p2);
        pazientiInArrivo.add(p3);
        pazientiInArrivo.add(p4);

        for (Paziente p : pazientiInArrivo) {
            try {
                ps.gestisciArrivo(p);
            } catch (NessunMedicoDisponibileException e) {
                System.out.println(e.getMessage());
            }
        }

    }
}
