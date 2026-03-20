package Exercises.Pirati.Es1;

public class Scrivano extends Thread {
    private Stiva s;

    public Scrivano(String name, Stiva stiva) {
        super(name); //setName(name)
        this.s = stiva;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try{
                LootItem item = s.getLoot();
            } catch (InterruptedException e){
                System.out.println(e.getMessage());
                interrupt();
            }
        }
    }
}
