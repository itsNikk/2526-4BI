package Exercises.Pirati.Es1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        final int MAX_PIRATES = 20;
        Stiva stiva = new Stiva(5);

        //Threads...
        ArrayList<Pirata> pirates = new ArrayList<>();

        for (int i = 0; i < MAX_PIRATES; i++) {
            pirates.add(new Pirata(stiva, "Pirata-" + (i + 1)));
        }
    }
}
