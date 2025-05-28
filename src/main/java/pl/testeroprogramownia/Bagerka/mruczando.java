package pl.testeroprogramownia.Bagerka;

public class mruczando {
    public static void miau() {
        String word = "miau";
        int count = 0;

        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);  // pobieramy znak na pozycji i
            count++;                  // zwiększamy licznik
        }

        System.out.println("Liczba znaków w wyrazie: " + count);


    }
    public static void miau2() {
    String word = "programowanie";
    int count = 0;

for (int i = 0; i < word.length(); i++) {
        char c = word.charAt(i);  // pobieramy znak na pozycji i
        count++;                  // zwiększamy licznik
    }

System.out.println("Liczba znaków w wyrazie: " + count);
}
}
