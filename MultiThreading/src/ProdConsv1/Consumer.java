package ProdConsv1;

public class Consumer extends Thread {
    private final Buffer buffer;

    public Consumer(Buffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {

            try {
                System.out.print("C:" + buffer.getValue());
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
