package Pandora;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        PostazioneRDA postazione = new PostazioneRDA(c);
        for (int i = 0; i < 30; i++) {
            try {
                Coordinata c = new Coordinata(46, 85);
                Arma z = new Arma();
                Avatar a = new Avatar("Jake", z, 123);

                a.attacca(postazione);
                System.out.println("avatar attacca");

                // Fa dormire il programma per 500 ms
                Thread.sleep(500);

            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            } catch (ArmaMalfunzionanteException armaMalfunzionanteException) {
                System.out.println(armaMalfunzionanteException.getMessage());
            } catch (AttccoFallitoException e) {
                System.out.println(e.getMessage());
            } catch (DifesaInsufficienteException d) {
                //Cambiare la posizione della Postazione...
                postazione.setPosition(new Coordinata(180, 150));
                postazione.setLifePoints(1500);
            }
        }
    }
}
