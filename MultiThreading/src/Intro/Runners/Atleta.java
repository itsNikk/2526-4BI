package Intro.Runners;

public class Atleta extends Thread {

    private long startTime;
    private long endTime;

    public Atleta(String name) {
        super(name); //setName(name)
    }

    //Metodo che definisce il comportamento di un THrtead
    @Override
    public void run() {
        startTime = System.currentTimeMillis();
        for (int i = 0; i < 10; i++) {
            System.out.println(getName() + "Step " + (i + 1));
            try {
                sleep(300 + (int) (Math.random() * 500));
            } catch (InterruptedException e) {
                //SI BENE.. e ora?
                System.out.println(getName() + " interrotto");
                break;
            }
        }

        endTime = System.currentTimeMillis();
    }

    public long getRaceTime() {
        return endTime - startTime;
    }
}
