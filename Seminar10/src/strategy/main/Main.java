package strategy.main;

import strategy.clase.*;

public class Main {
    public static void main(String[] args){
        Jandarm jandarm1 = new Jandarm("Ion");
        Spectator spectator1 = new Spectator("Mircea");
        Spectator spectator2 = new Spectator("Valentin");
        Spectator spectator3 = new Spectator("Matei");
        Spectator spectator4 = new Spectator("Alexandru");

        jandarm1.verificaSpectator(spectator1);
        jandarm1.setModVerificare(new VerificareVIP());
        jandarm1.verificaSpectator(spectator2);
        jandarm1.setModVerificare(new VerificareTribuna());
        jandarm1.verificaSpectator(spectator3);

    }
}
