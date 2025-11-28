package CD.Impl.ScooterRental.vehicles;

public class Main {
    public static void main(String[] args) {
        Scooter s = new Scooter("scooters");
        Battery battery = new Battery("BT1", 100);
        s.addBattery(battery);
    }
}
