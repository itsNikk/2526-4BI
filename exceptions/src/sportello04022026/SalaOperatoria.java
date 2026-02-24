package sportello04022026;

public class SalaOperatoria {
    private int numeroSala;
    private boolean isBusy;

    public SalaOperatoria(int numero) {
        this.numeroSala = numero;
        this.isBusy = false;
    }

    //TODO: occupa() -> occupa la sala se libera, altrimenti eccezione
    public void occupa() {
        if (isBusy) throw new SalaOperatoriaOccupataException(numeroSala);
        this.isBusy = true;
    }
}
