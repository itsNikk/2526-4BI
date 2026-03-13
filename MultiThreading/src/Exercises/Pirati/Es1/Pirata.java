package Exercises.Pirati.Es1;

public class Pirata extends Thread {

    private Stiva stiva;

    public Pirata(Stiva stiva, String name) {
        this.stiva = stiva;
        setName(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                stiva.depositLoot(new LootItem("LootItem-" + (i + 1), 120));
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
