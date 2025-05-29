package pl.testeroprogramownia.Bagerka;

import java.util.Random;

public class SmaczkiCounter {
    public static void policzSmaczki() {

        Random random = new Random();
        int smaczki = random.nextInt(10) + 1;

        int i;
        for (i = 0; i < smaczki; i++) {

        }
        //żeby pokazać tylko ostatnią liczbę, należy wyrzucić print poza nawias klamrowy
        System.out.println("Zjadłam " + i + " smaczków!");
        if (i > 7) {
            System.out.println("Najadłam się!");

        }else{
            System.out.println("Jestem głodna!");
        }
    }
}
