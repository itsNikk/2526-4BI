package sportello04022026;

public class Paziente {
    private String name;
    private String codGravita;
    private boolean diagnosiEffettuata;

    public Paziente(String name, String codGravita) {
        this.name = name;
        this.codGravita = codGravita;
        this.diagnosiEffettuata = false;
    }

    // ritorna true se il paziente è in pericolo (ross/giallo)
    public boolean richiedeOperazione() {
        /*if (codGravita.equalsIgnoreCase("rosso") || codGravita.equalsIgnoreCase("giallo")) {
            return true;
        }
        return false;
        */
        return codGravita.equalsIgnoreCase("rosso")
                || codGravita.equalsIgnoreCase("giallo");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCodGravita() {
        return codGravita;
    }

    public void setCodGravita(String codGravita) {
        this.codGravita = codGravita;
    }

    public boolean isDiagnosiEffettuata() {
        return diagnosiEffettuata;
    }

    public void setDiagnosiEffettuata(boolean diagnosiEffettuata) {
        this.diagnosiEffettuata = diagnosiEffettuata;
    }

    @Override
    public String toString() {
        return "[ " + codGravita + "] " + name;
    }
}
