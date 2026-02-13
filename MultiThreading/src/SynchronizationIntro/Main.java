package SynchronizationIntro;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Counter c = new Counter();
        AdderThread adderThread = new AdderThread(c);
        AdderThread adderThread2 = new AdderThread(c);

        adderThread.start();
        adderThread2.start();

        adderThread.join();
        adderThread2.join();

        System.out.println(c.getCount());
    }
}
