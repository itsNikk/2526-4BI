package SynchronizationIntro;

import java.util.concurrent.Semaphore;

public class AdderThread extends Thread {

    private Counter counter;

    public AdderThread(Counter c) {
        this.counter = c;
    }

    @Override
    public void run() {
        for (int i = 0; i < 200000; i++) {
            //somma 1 al contatore
            try {
                counter.add(1);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
