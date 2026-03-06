package ProdConsv1;

public class Producer extends Thread {
    private final Buffer buffer;

    public Producer(Buffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        //Per 10 volte, fai +1 nel buffer
        for (int i = 1; i <= 10; i++) {
            try {
                buffer.setValue(i);
                System.out.print("P:" + i);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
