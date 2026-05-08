import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        new Monitor().start();
        ArrayList<String> a = new ArrayList<>();
        a.add("sdfjkhgbsdjkb");
        String s = a.remove(0);
        System.out.println(a);
        System.out.println("main finito");
    }


}

class Monitor extends Thread {
    public Monitor() {
        setDaemon(true);
    }

    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("log " + i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
            }
        }
    }
}
