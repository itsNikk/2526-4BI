package Exercises.Parking;

public class ParkingLot {
    private int availableSlots;
    private final int MAX;

    public ParkingLot(int initialSlots) {
        this.MAX = initialSlots;
        this.availableSlots = MAX;
    }

    public void enter(Auto auto) throws InterruptedException {
        while (availableSlots < 0) {
            System.out.println(auto.getName() + " in attesa (parcheggio pieno)");
            wait();
        }
        availableSlots--;
        System.out.println(auto.getName() + " entrata. Posti disponibili: " + availableSlots);
    }


}
