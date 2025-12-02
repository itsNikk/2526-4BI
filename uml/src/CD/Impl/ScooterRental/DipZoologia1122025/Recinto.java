package CD.Impl.ScooterRental.DipZoologia1122025;

import CD.Impl.ScooterRental.DipZoologia1122025.animali.AnimaleNormale;
import CD.Impl.ScooterRental.DipZoologia1122025.animali.CriptoAnimale;

public class Recinto {
    private AnimaleNormale[] animaleNormales;
    private CriptoAnimale[] criptoAnimales;

    public Recinto() {

    }

    public int contaCreature() {
        return animaleNormales.length + criptoAnimales.length;

    }
}
