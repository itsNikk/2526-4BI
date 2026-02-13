package SynchronizationIntro;

import java.util.concurrent.Semaphore;

public class AdderThread extends Thread {

    static Counter counter = new Counter();
    //mutex
    static final Semaphore sem = new Semaphore(1);


    @Override
    public void run() {
        for (int i = 0; i < 200000; i++) {
            //somma 1 al contatore
            try {
                sem.acquire();
                counter.add(1);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
