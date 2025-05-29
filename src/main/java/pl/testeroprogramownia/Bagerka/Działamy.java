package pl.testeroprogramownia.Bagerka;


import static pl.testeroprogramownia.Bagerka.BageraDay.bageraActivities;
import static pl.testeroprogramownia.Bagerka.Mruczando.miau;
import static pl.testeroprogramownia.Bagerka.Mruczando.miau2;

public class Działamy {
    public static void main(String[] args) {
        //z metodą statyczną
        bageraActivities();
        miau();
        miau2();

        //bez metody statycznej
//        BageraDay a = new BageraDay();
//        a.bageraActivities();
    }
}
