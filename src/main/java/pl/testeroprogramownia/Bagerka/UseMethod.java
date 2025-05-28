package pl.testeroprogramownia.Bagerka;


import static pl.testeroprogramownia.Bagerka.BageraDay.bageraActivities;
import static pl.testeroprogramownia.Bagerka.mruczando.miau;

public class UseMethod {
    public static void main(String[] args) {
        //z metodą statyczną
        bageraActivities();
        miau();

        //bez metody statycznej
//        BageraDay a = new BageraDay();
//        a.bageraActivities();
    }
}
