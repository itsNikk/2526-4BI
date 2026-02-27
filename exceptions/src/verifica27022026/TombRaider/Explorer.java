package verifica27022026.TombRaider;

import java.util.ArrayList;

public class Explorer {
    private String name;
    private int torches;
    private ArrayList<Item> inventory;
    private int inventoryWeight;

    private final int MAX_INVENTORY_WEIGHT = 10;

    public Explorer(String name, int torches) {
        this.name = name;
        this.torches = torches;
        this.inventoryWeight = 0;
        this.inventory = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTorches() {
        return torches;
    }

    public void setTorches(int torches) {
        this.torches = torches;
    }

    public boolean hasNoTorches() {
        return torches <= 0;
    }

    public void addItem(Item item) {
        //Just a basic guard, I'll update later
        if (inventoryWeight >= MAX_INVENTORY_WEIGHT) return;

        inventory.add(item);
        inventoryWeight += item.getWeight();
    }
}
