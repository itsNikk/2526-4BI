package Pandora;

public class Coordinata {
    //CTRL+D = duplica riga
    private double latitudine;
    private double longitudine;

    public Coordinata(double latitudine, double longitudine) throws IllegalArgumentException {
        if (latitudine < -90.0 || latitudine > 90.0)
            throw new IllegalArgumentException("latitudine non valida");

        if (longitudine < -180.0 || longitudine > 180.0)
            throw new IllegalArgumentException("latitudine non valida");


        this.latitudine = latitudine;
        this.longitudine = longitudine;

    }
}
