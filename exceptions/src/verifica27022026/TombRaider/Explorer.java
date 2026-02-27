package verifica27022026.TombRaider;

import java.util.ArrayList;

public class Explorer {
    private String name;
    private int torches;
    private ArrayList<Item> inventory;

    private int inventoryWeight;

    private final int MAX_INVENTORY_WEIGHT;

    public Explorer(String name, int torches, int maxInventoryWeight) {
        this.name = name;
        this.torches = torches;
        this.inventoryWeight = 0;
        this.inventory = new ArrayList<>();
        this.MAX_INVENTORY_WEIGHT = maxInventoryWeight;
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

    public void addItem(Item item) throws InventoryFullException {
        if (inventoryWeight + item.getWeight() >= MAX_INVENTORY_WEIGHT)
            throw new InventoryFullException("Inventario pieno. Rimuovo oggetto più pesante.");
        inventory.add(item);
        inventoryWeight += item.getWeight();
    }

    public int getInventoryWeight() {
        return inventoryWeight;
    }

    public void removeHeaviestItemAndAdd(Item itemToAdd) {
        Item heaviestItem = getHeaviestItem();
        inventory.remove(heaviestItem);
        inventoryWeight -= heaviestItem.getWeight();

        inventory.add(itemToAdd);
    }

    //Helper non necessario ma utile
    private Item getHeaviestItem() {
        Item heaviestItem = inventory.get(0); //same as getFirst() ma non so se lo avete fatto.
        //Trovare il più pesante
        for (int i = 1; i < inventory.size(); i++) {
            Item current = inventory.get(i);
            if (current.getWeight() > heaviestItem.getWeight()) {
                heaviestItem = current;
            }
        }
        return heaviestItem;
    }
}
