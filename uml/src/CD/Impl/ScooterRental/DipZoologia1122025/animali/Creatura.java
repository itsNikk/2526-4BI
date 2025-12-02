package CD.Impl.ScooterRental.DipZoologia1122025.animali;

import CD.Impl.ScooterRental.DipZoologia1122025.accessori.AccessorioTracciamento;
import CD.Impl.ScooterRental.DipZoologia1122025.accessori.GPS;
import CD.Impl.ScooterRental.DipZoologia1122025.accessori.Microcamera;

public class Creatura {
    private double peso;
    private String name;
    private AccessorioTracciamento[] accessori;

    private int index = 0;

    public Creatura(String name, double peso) {
        this.name = name;
        this.peso = peso;
        this.accessori = new AccessorioTracciamento[10];
        addAccessorio(new GPS());
        addAccessorio(new Microcamera());
        addAccessorio(new Microcamera());
    }

    public void addAccessorio(AccessorioTracciamento accessorioTracciamento) {
        this.accessori[index++] = accessorioTracciamento;
    }
}
