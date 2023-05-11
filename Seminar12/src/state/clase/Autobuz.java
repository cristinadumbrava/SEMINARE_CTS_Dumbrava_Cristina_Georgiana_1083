package state.clase;

public class Autobuz {
    private IStare stare;
    private String nrInmatriculare;

    public Autobuz(String nrInmatriculare) {
        this.nrInmatriculare = nrInmatriculare;
        this.stare = new StareLaCapatDeLinie(); //pt ca e si inceput de linie
    }

    public String getNrInmatriculare() {
        return nrInmatriculare;
    }

    public IStare getStare() {
        return stare;
    }

    protected void setStare(IStare stare) {
        this.stare = stare;
    }

    //pt cererile pe care le facem pe autobuz
    public void pleacaInCursa(){
        //apelam actiunea de la starea concreta
        IStare stareInCursa = new StareInCursa();
        stareInCursa.schimbaStareAutobuz(this);
    }

    public void pleacaInService(){
        IStare stareInService = new StareInService();
        stareInService.schimbaStareAutobuz(this);
    }



    public void ajungiLaCapatDeLinie(){
        IStare stareLaCapatDeLinie = new StareLaCapatDeLinie();
        stareLaCapatDeLinie.schimbaStareAutobuz(this);
    }


}
