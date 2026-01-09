public class Main {
    public static void main(String[] args) {
        try {
            CodiceFiscale cf = new CodiceFiscale("aaaaaaaaaaaaaaaa");
            System.out.println(cf + " VALIDO");
        } catch (CodiceFiscaleNonValidoException e) {
            System.out.println(e.getMessage());
        }
    }
}
