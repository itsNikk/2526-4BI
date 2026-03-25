package Exercises.Parkingv2;

public class ParkingLot {
    private int availableSlots;
    private final int MAX;

    public ParkingLot(int initialSlots) {
        this.MAX = initialSlots;
        this.availableSlots = MAX;
    }

    public synchronized void enter(Veicolo veicolo) throws InterruptedException {
        while (availableSlots < veicolo.getType().getPostiOccupati()) {
            System.out.println(veicolo.getName() + " in attesa (parcheggio pieno)");
            wait();
        }
        availableSlots-=veicolo.getType().getPostiOccupati();
        System.out.println(veicolo.getName() + " entrata. Posti disponibili: " + availableSlots);
    }

    public synchronized void exit(Veicolo veicolo) {
        availableSlots += veicolo.getType().getPostiOccupati();
        System.out.println(veicolo.getName() + " uscita. Posti disponibili: " + availableSlots);
        notifyAll();
    }


}
