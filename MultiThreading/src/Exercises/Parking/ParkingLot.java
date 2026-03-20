package Exercises.Parking;

public class ParkingLot {
    private int availableSlots;
    private final int MAX;

    public ParkingLot(int initialSlots) {
        this.MAX = initialSlots;
        this.availableSlots = MAX;
    }

    public synchronized void enter(Auto auto) throws InterruptedException {
        while (availableSlots == 0) {
            System.out.println(auto.getName() + " in attesa (parcheggio pieno)");
            wait();
        }
        availableSlots--;
        System.out.println(auto.getName() + " entrata. Posti disponibili: " + availableSlots);
    }

    public void exit(Auto auto) {
        availableSlots++;
        System.out.println(auto.getName() + " uscita. Posti disponibili: " + availableSlots);
        notifyAll();
    }


}
