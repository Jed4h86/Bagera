package pl.testeroprogramownia.Bagerka;

import java.util.Random;

public class Mruczando {
    public static void miau() {

        String word = "miau";
        int count = 0;

        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);  // pobieramy znak na pozycji i
            count++;                  // zwiększamy licznik
        }

        System.out.println("Liczba znaków w wyrazie: "+word +" "+ count);


    }
    public static void miau2() {
    String word = "miauuuuuuu";
    int count = 0;

for (int i = 0; i < word.length(); i++) {
    count++;
}
        System.out.println("Liczba znaków w wyrazie: " + count);
}


}

