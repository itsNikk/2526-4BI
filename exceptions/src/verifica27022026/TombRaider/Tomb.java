package verifica27022026.TombRaider;

import java.util.ArrayList;
import java.util.Random;

public class Tomb {
    private Explorer explorer;
    private Random random;
    private int totalCorridors;

    private String[] itemNames;

    public Tomb(Explorer explorer, int totalCorridors) {
        this.explorer = explorer;
        this.random = new Random();
        this.totalCorridors = totalCorridors;
        this.itemNames = new String[]{"amuleto", "scarabeo", "statuetta", "pergamena"};
    }

    public void explore() throws InterruptedException {
        for (int currentCorridor = 1; currentCorridor <= totalCorridors; currentCorridor++) {

            if (explorer.hasNoTorches()) {
                throw new OutOfTorchesException("Torce esaurite al corridoio " + currentCorridor);
            }


            //region TrapEvent
            if (random.nextDouble() < 0.40) {
                int lost = 1 + random.nextInt(3);
                try {
                    //Si, lancio per gestire... strano ma è quello richiesto ;)
                    throw new TrapException("Trappola! Perse " + lost + " torce.");
                } catch (TrapException e) {
                    explorer.setTorches(explorer.getTorches() - lost);
                    System.out.println("Corridoio " + currentCorridor + ": TRAPPOLA! Perse " + lost + " torce. Torce rimanenti: " + explorer.getTorches() + ".");
                }
            } else {
                explorer.setTorches(explorer.getTorches() - 1);
                System.out.println("Corridoio " + currentCorridor + ": avanzato. Torce rimanenti: " + explorer.getTorches() + ".");
            }
            //endregion


            //region ItemEvent
            double itemProb = 0.40 + (0.20 * random.nextDouble());
            if (random.nextDouble() < itemProb) {
                //Spawn new Item :=)
                int itemWeight = 1 + random.nextInt(5);
                //Ottengo nome random
                String itemName = itemNames[random.nextInt(itemNames.length)];
                Item item = new Item(itemName, itemWeight);
                try {
                    explorer.addItem(item);
                    System.out.println("Corridoio: " + currentCorridor + ". Trovato " + item.getName() + "(" + item.getWeight() + "kg). Peso totale inventario: " + explorer.getInventoryWeight() + "kg.");
                } catch (InventoryFullException e) {
                    System.out.println(e.getMessage());
                    explorer.removeHeaviestItemAndAdd(item);
                }
            }
            //endregion
            if (explorer.hasNoTorches()) {
                throw new OutOfTorchesException("Torce esaurite al corridoio " + currentCorridor);
            }

            Thread.sleep(1000);

        }
    }
}