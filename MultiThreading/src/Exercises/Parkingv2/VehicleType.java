package Exercises.Parkingv2;

public enum VehicleType {
    AUTO(1),
    MOTO(1),
    CAMION(2),
    AUTOBUS(3);

    private final int postiOccupati;

    VehicleType(int postiOccupati) {
        this.postiOccupati = postiOccupati;
    }

    public int getPostiOccupati() {
        return postiOccupati;
    }
}
