package ProdConsv1;

public class Buffer {
    //Valore attuale
    private int value;

    //Quanti ne ho in questo momento
    private int numItemsInside = 0;
    //MAX
    private final int MAXSIZE = 1;

    //CHiamato dal producer
    public synchronized void setValue(int newValue) throws InterruptedException {

        //Se buffer pieno, aspetta!
        if (numItemsInside == MAXSIZE) wait();

        numItemsInside++;
        notify();
        this.value = newValue;
    }

    //CHiamato dal Consumer
    public synchronized int getValue() throws InterruptedException {

        if (numItemsInside == 0) wait();

        numItemsInside--;
        notify();
        return this.value;
    }
}
