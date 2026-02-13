package SynchronizationIntro;

import java.util.concurrent.Semaphore;

public class Counter {
    private long count;

    private final Semaphore s;

    public Counter() {
        this.s = new Semaphore(1);
    }

    public void add(long value) throws InterruptedException{
        s.acquire();
        //this.count += value;
        long tmp = this.count;
        tmp = tmp + value;
        this.count = tmp;
        s.release();
    }

    public long getCount() {
        return count;
    }
}
