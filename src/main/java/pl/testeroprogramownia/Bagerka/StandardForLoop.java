package pl.testeroprogramownia.Bagerka;

public class StandardForLoop {
    public static void main(String[] args) {
        //wypisz cyfry od 0 do 10
        System.out.println("wypisz cyfry od 0 do 10:");
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
        //wyswietl liczby parzyste
        System.out.println("wyswietl liczby parzyste:");
        for (int j = 2; j < 10; j = j + 2) {
            System.out.println(j);
        }
//wyswietl liczby nieparzyste
        System.out.println("wyswietl liczby nieparzyste:");
        for (int j = 2; j < 10; j = j + 2) {
            System.out.println(j);

    }
        //wypisz cyfry od 10 do 0
        System.out.println("wypisz cyfry od 10 do 0:");
        for (int k = 10; k > 0; k--) {
            System.out.println(k);
        }
        /// wypisz Stringi:
        System.out.println("wypisz Stringi:");
        for (int l = 0; l < 10; l++){
            System.out.println(l + " Dostanę smaczków");
        }

    }
}
