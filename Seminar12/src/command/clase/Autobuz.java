package command.clase;

public class Autobuz implements IAutomobil{
    private int nrAutobuz;

    public Autobuz(int nrAutobuz) {
        this.nrAutobuz = nrAutobuz;
    }

    @Override
    public void plecareInCursa(int nrLinie) {
        System.out.println("Autobuzul cu numarul " + this.nrAutobuz + " a plecat in curs pe linia "
                + + nrLinie);
    }
}
