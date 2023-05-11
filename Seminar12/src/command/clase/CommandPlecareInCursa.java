package command.clase;

public class CommandPlecareInCursa implements ICommand{
    private int nrLinie; //starea
    private IAutomobil automobil; //executantul

    public CommandPlecareInCursa(int nrLinie, IAutomobil automobil) {
        this.nrLinie = nrLinie;
        this.automobil = automobil;
    }

    @Override
    public void executa() {
        //apelez functia de plecare in curs
        automobil.plecareInCursa(this.nrLinie);
    }
}
