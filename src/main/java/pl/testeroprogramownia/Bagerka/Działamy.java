package pl.testeroprogramownia.Bagerka;


import static pl.testeroprogramownia.Bagerka.BageraDay.bageraActivities;
import static pl.testeroprogramownia.Bagerka.Mruczando.miau;
import static pl.testeroprogramownia.Bagerka.Mruczando.miau2;
import static pl.testeroprogramownia.Bagerka.Return.kabanosyBagery;
import static pl.testeroprogramownia.Bagerka.Return.mniejKabanosow;

public class Działamy {
    public static void main(String[] args) {
        //z metodą statyczną
//        bageraActivities();
//        miau();
//        miau2();

        //bez metody statycznej
//        BageraDay a = new BageraDay();
//        a.bageraActivities();
//kabanosyBagery(1,2);
        System.out.println(kabanosyBagery(1,2));
        System.out.println(mniejKabanosow(12,7));
    }
}
