public class CodiceFiscale {

    private final int MAX_LENGTH = 16;

    private String cf;

    public CodiceFiscale(String cf) throws CodiceFiscaleNonValidoException {
        if (cf.length() != MAX_LENGTH) throw new CodiceFiscaleNonValidoException("CF NON VALIDO");

        this.cf = cf;
    }

    @Override
    public String toString() {
        return cf;
    }
}
