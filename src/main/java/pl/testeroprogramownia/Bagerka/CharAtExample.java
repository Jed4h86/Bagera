package pl.testeroprogramownia.Bagerka;

public class CharAtExample{
    public static void main(String[] args) {

        // 1. Wyciąganie znaku z String – metoda .charAt(int index)
        String tekst = "Testeroprogramowania";
        char znak = tekst.charAt(3);  // indeksy zaczynają się od 0
        System.out.println("Znak na pozycji 3: " + znak);  // wypisze: 't'

        // 2. Sprawdzenie, czy w String występuje dany znak – pętla
        char litera1 = 'g';
        boolean wystepuje = false;

        for (int i = 0; i < tekst.length(); i++) {
            if (tekst.charAt(i) == litera1) {
                wystepuje = true;
                break;
            }
        }
        System.out.println("Czy litera '" + litera1 + "' występuje: " + wystepuje);

        // 3. Krótsza wersja – z użyciem .indexOf(char)
        char litera2 = 'g';

        if (tekst.indexOf(litera2) >= 0) {
            System.out.println("Litera '" + litera2 + "' występuje w stringu.");
        } else {
            System.out.println("Litera '" + litera2 + "' nie występuje.");
        }

        // 4. Zliczanie, ile razy występuje dana litera:
        char litera3 = 'a';
        int licznik = 0;

        for (int i = 0; i < tekst.length(); i++) {
            if (tekst.charAt(i) == litera3) {
                licznik++;
            }
        }

        System.out.println("Litera '" + litera3 + "' występuje " + licznik + " razy.");
    }
}
