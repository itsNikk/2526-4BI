package Exercises.Pirati.Es1;

import java.util.ArrayList;

//Shared resource...
public class Stiva {
    private ArrayList<LootItem> stiva;
    private final int MAX_SIZE;

    public Stiva(int maxSize) {
        this.stiva = new ArrayList<>();
        this.MAX_SIZE = maxSize;
    }

    public synchronized void depositLoot(LootItem lootItem) throws InterruptedException {
        while (stiva.size() == MAX_SIZE) wait();
        stiva.add(lootItem);
        notifyAll();
    }

    public synchronized LootItem getLoot() throws InterruptedException {
        while (stiva.isEmpty()) wait();

        //FIFO....
        LootItem toGetBack = stiva.remove(0);
        notifyAll();
        return toGetBack;

    }


}
