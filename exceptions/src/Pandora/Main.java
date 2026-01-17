package Pandora;

public class Main {
    public static void main(String[] args) {
        try {
            Coordinata c = new Coordinata(16516, 468468);
            Arma z = new Arma();
            Avatar a = new Avatar("dnfjf", z, 123);
            a.attacca(new PostazioneRDA());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } catch (ArmaMalfunzionanteException armaMalfunzionanteException) {
            System.out.println(armaMalfunzionanteException.getMessage());
        } catch (AttccoFallitoException e) {
            System.out.println(e.getMessage());
        }
    }
}
