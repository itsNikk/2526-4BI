package Pandora;

public class Main {
    public static void main(String[] args) {
        try {
            Coordinata c = new Coordinata(16516, 468468);
            Arma z = new Arma();
            Avatar a = new Avatar("dnfjf", new Arma(), 123);
            a.attacca(new PostazioneRDA());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } catch (ArmaMalfunzionanteException a) {

        } catch (AttccoFallitoException e) {
            System.out.println(e.getMessage());
        }
    }
}
