package strategy.clase;

public class Jandarm {
    private Strategy modVerificare;
    private String nume;

    public Jandarm(String nume) {
        this.nume = nume;
        modVerificare = new VerificarePeluza();
    }

    public void setModVerificare(Strategy modVerificare) {
        this.modVerificare = modVerificare;
    }

    public void verificaSpectator(Spectator spectator){
        this.modVerificare.modVerificareSpectator(spectator);
    }

}
