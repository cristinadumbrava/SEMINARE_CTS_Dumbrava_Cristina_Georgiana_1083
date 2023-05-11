package strategy.main;

import strategy.clase.Calator;
import strategy.clase.PlataCardBancar;
import strategy.clase.PlataCardCalatorii;
import strategy.clase.PlataPrinSMS;

public class Main {
    public static void main(String[] args){
        Calator calator = new Calator("Andrei");
        calator.platesteBilet(20);
        calator.setTipPlata(new PlataPrinSMS());

        calator.platesteBilet(20);
        calator.setTipPlata(new PlataCardBancar());

        calator.platesteBilet(25);
        calator.setTipPlata(new PlataCardCalatorii());
        calator.platesteBilet(30);

    }
}
