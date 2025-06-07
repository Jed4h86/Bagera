package pl.testeroprogramownia.Bagerka;

import java.util.ArrayList;
import java.util.List;

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
    public static void listaZakupów2(){
        List<String> zakupyDlaBagery = new ArrayList<>();
        zakupyDlaBagery.add("Sucha karma");
        zakupyDlaBagery.add("Mokra karma");
        zakupyDlaBagery.add("Żwirek");
        zakupyDlaBagery.add("Zabawka");

        System.out.println(zakupyDlaBagery.get(1));
        System.out.println(zakupyDlaBagery.size());
        for(String elements:zakupyDlaBagery){
            System.out.println(elements);
        }


    }


}

