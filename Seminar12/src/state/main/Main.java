package state.main;

import state.clase.Autobuz;

public class Main {
    public static void main(String[] args){
        Autobuz autobuz = new Autobuz("BUC145");
        autobuz.pleacaInService();
        autobuz.ajungiLaCapatDeLinie();
        autobuz.ajungiLaCapatDeLinie();
        autobuz.pleacaInCursa();
        autobuz.pleacaInService();
        autobuz.ajungiLaCapatDeLinie();
    }
}
