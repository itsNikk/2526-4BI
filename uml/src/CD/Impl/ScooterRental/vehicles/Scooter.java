package CD.Impl.ScooterRental.vehicles;

public class Scooter {
    private String model;
    private Battery battery;

    public Scooter(String model) {
        this.model = model;
    }

    public void addBattery(Battery battery) {
        this.battery = battery;
    }

    public void removeBattery() {
        this.battery = null;
    }
}
