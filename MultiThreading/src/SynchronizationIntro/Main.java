package SynchronizationIntro;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        AdderThread adderThread = new AdderThread();
        AdderThread adderThread2 = new AdderThread();

        adderThread.start();
        adderThread2.start();

        adderThread.join();
        adderThread2.join();

        System.out.println(AdderThread.counter.getCount());
    }
}
