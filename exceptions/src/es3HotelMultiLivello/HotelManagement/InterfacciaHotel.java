package es3HotelMultiLivello.HotelManagement;

import es3HotelMultiLivello.HotelExceptions.CameraOccupataException;
import es3HotelMultiLivello.HotelExceptions.ClienteNonValidoException;
import es3HotelMultiLivello.HotelExceptions.PrenotazioneException;

import java.util.ArrayList;

public class InterfacciaHotel {
    private GestorePrenotazioni gestorePrenotazioni;
    private ArrayList<String> storicoOperazioni;


    public InterfacciaHotel() {
        this.gestorePrenotazioni = new GestorePrenotazioni();
        this.storicoOperazioni = new ArrayList<>();
    }

    public InterfacciaHotel(GestorePrenotazioni gestorePrenotazioni) {
        this.gestorePrenotazioni = gestorePrenotazioni;
        this.storicoOperazioni = new ArrayList<>();
    }

    public void richiestaPrenotazione(String camera, String cliente) {
        try {
            gestorePrenotazioni.prenota(camera, cliente);
        } catch (CameraOccupataException cameraOccupataException) {
            storicoOperazioni.add("Camera " + camera + " non disponibile");
        } catch (ClienteNonValidoException clienteNonValidoException) {
            storicoOperazioni.add("Dati cliente non validi");
        } catch (PrenotazioneException prenotazioneException) {
            storicoOperazioni.add("Errore di sistema, riprova più tardi");
        }
        storicoOperazioni.add("Richiesta processata per camera " + camera);
    }

    public void stampaStorico() {
        //for su array e stampa
    }


}
