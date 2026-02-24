package sportello04022026;

public class Medico {
    private String name;
    private boolean isBusy;

    //E chi sta curando?
    private Paziente pazienteCorrente;

    public Medico(String name) {
        this.name = name;
        this.isBusy = false;
        this.pazienteCorrente = null;
    }

    //TODO: Assegnare paziente a medico
    public void assegnaPaziente(Paziente p) {
        this.pazienteCorrente = p;
        this.isBusy = true;
    }

    //TODO: liberare medico
    public void liberaMedico() {
        this.isBusy = false;
        this.pazienteCorrente = null;
    }

    @Override
    public String toString() {
        if (!isBusy) {
            //CTRL+D
            return "Dr. " + this.name + "[LIBERO]";
        } else {
            return "Dr. " + this.name + "[OCCUPATO]";
        }

    }
}

