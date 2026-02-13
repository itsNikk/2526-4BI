package SynchronizationIntro;

public class Counter {
    private long count;

    public void add(long value) {
        //this.count += value;
        long tmp = this.count;
        tmp = tmp + value;
        this.count = tmp;
    }

    public long getCount() {
        return count;
    }
}
