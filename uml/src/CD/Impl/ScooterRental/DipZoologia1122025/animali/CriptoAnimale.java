package CD.Impl.ScooterRental.DipZoologia1122025.animali;

public class CriptoAnimale extends Creatura {
    private int segretezza;


    public CriptoAnimale(String nome, double peso, int segretezza) {
        super(nome, peso);
        this.segretezza = segretezza;
    }


    public boolean isPericoloso() {

        if (segretezza > 10) return true;
        return false;
    }
}
