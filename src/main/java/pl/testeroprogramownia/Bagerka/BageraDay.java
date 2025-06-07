package pl.testeroprogramownia.Bagerka;

import java.util.Random;

public class BageraDay {
    public static void bageraActivities() {
        Random random = new Random();

        int activities = random.nextInt(7);
        System.out.println("Co będę dziś robić?");

        switch (activities){

            case 1:
                System.out.println("Gryźć pańcie");
                break;
            case 2:
                System.out.println("Mruczeć");
                break;
            case 3:
                System.out.println("Jeść smaczki");
                SmaczkiCounter.policzSmaczki();
                break;
            case 4:
                System.out.println("Rozrabiać!");
                break;
            case 5:
                System.out.println("Pić wodę z kranu!");
                break;
            case 6:
                System.out.println("Bawić się!");
                break;
            default:
                System.out.println("Spać");
        }
    }
}
