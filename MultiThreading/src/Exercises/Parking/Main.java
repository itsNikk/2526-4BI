package Exercises.Parking;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        ParkingLot parkingLot = new ParkingLot(5);

        List<Auto> autos = new ArrayList<>();
        final int MAX_AUTO = 10;

        for (int i = 0; i < MAX_AUTO; i++) autos.add(new Auto("Auto-" + (i + 1), parkingLot));

        for(Auto a : autos) a.start();
        for(Auto a : autos) a.join();

        System.out.println("FINE");


    }
}
