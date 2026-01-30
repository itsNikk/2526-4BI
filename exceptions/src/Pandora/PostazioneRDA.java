package Pandora;

public class PostazioneRDA {
    private double lifePoints;

    private double unobtanium;
    private Coordinata position;
    public PostazioneRDA(Coordinata position) {
        this.position = position;
    }

    //si chaima difendi() nelle specifiche

    public void riceviDanno(double amount) throws DifesaInsufficienteException {
        if (lifePoints < amount) throw new DifesaInsufficienteException("Difesa Postaizone insufficiente");

        lifePoints -= amount;
    }
    public Coordinata getPosition() {
        return position;
    }

    public void setPosition(Coordinata position) {
        this.position = position;
    }

    public double getLifePoints() {
        return lifePoints;
    }

    public void setLifePoints(double lifePoints) {
        this.lifePoints = lifePoints;
    }

    public double getUnobtanium() {
        return unobtanium;
    }

    public void setUnobtanium(double unobtanium) {
        this.unobtanium = unobtanium;
    }
}
