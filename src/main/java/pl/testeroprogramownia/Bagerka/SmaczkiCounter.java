package pl.testeroprogramownia.Bagerka;

import java.util.Random;

public class SmaczkiCounter {
    public static void policzSmaczki() {

        Random random = new Random();
        int smaczki = random.nextInt(10) + 1;

        for (int i = 0; i<smaczki; i++){

            System.out.println("Zjadłam " +i + " smaczków!");
        }
        System.out.println("Najadłam się!");


    }
}
