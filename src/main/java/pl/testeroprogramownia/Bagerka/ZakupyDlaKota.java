package pl.testeroprogramownia.Bagerka;

public class ZakupyDlaKota {
    public static void listaZakupów() {

        String lista[] = {"Sucha karma", "Mokra karma", "Żwirek", "Zabawka"};

        System.out.println(lista[1]);
        for (int i = 0; i < lista.length; i++) {
            System.out.println(lista[i]);

        }
        System.out.println("Wersja z pętlą for-each:");
        for (String element : lista) {
            System.out.println(element);

        }

    }

}

