package sportello04022026;

public class SalaOperatoriaOccupataException extends RuntimeException {
    public SalaOperatoriaOccupataException(int numeroSala) {
        super("Errore: La sala " + numeroSala + " è già occupata.");
    }
}
