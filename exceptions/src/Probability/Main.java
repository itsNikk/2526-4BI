package Probability;

import java.util.Random;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        // Math.random vs new Random();
        // /dev/urandom o /dev/random
        Random r = new Random();
        for (int i = 0; i < 100000; i++) {
            double val = r.nextDouble(); // [0.0, 1.00)

            System.out.println(val);

            if (val <= 0.3) {
                throw new RuntimeException("BOOM");
            }


            Thread.sleep(1000);
        }
    }
}
