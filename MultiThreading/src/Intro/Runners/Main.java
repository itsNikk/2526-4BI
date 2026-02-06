package Intro.Runners;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Atleta a = new Atleta("Andrea");
        Atleta b = new Atleta("Chiara");

        a.start();
        b.start();

        /*
        boolean toEliminate = new Random().nextBoolean();
        if (toEliminate) a.interrupt();
        else b.interrupt();
*/
        try {
            a.join();
            b.join();
        } catch (InterruptedException c) {
            System.out.println(c.getMessage());
        }

        System.out.println(a.getName() + ": TEMPO:" + a.getRaceTime());
        System.out.println(b.getName() + ": TEMPO:" + b.getRaceTime());

    }
}
