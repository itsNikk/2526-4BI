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

    
}
