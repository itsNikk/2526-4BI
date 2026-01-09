public class CodiceFiscale {

    private final int MAX_LENGTH = 16;

    private String cf;

    public CodiceFiscale(String cf) throws CodiceFiscaleNonValidoException {
        if (cf.length() != MAX_LENGTH) throw new CodiceFiscaleNonValidoException("CF NON VALIDO");

        /*
         *1) for + charAt()
         * 2) usa il vettore dei caraterri più controllo
         * 3) isDigitOrLetter()
         */
        for (int i = 0; i < cf.length(); i++) {
            if (!isLetter(cf.charAt(i)) && !Character.isDigit(cf.charAt(i))) throw new CodiceFiscaleNonValidoException("CF non alfanumerico");
        }

        if (!Character.isUpperCase(cf.charAt(MAX_LENGTH - 1))) throw new CodiceFiscaleNonValidoException("ctrl char NON MAIUSCOLO");

        this.cf = cf;
    }

    private boolean isLetter(char c) {
        return (c >= 65 && c <= 90) || (c >= 97 && c <= 122);
    }

    @Override
    public String toString() {
        return cf;
    }
}
