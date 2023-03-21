package simplefactory;

public class Anestezist implements PersonalSpital{
    private String nume;
    private int nrPacienti;

    public Anestezist(String nume, int nrPacienti){
        this.nume = nume;
        this.nrPacienti = nrPacienti;
    }

    @Override
    public void descriere() {
        System.out.println("Anestezistul " + this.nume + " a anesteziat " + this.nrPacienti + " pacienti.");
    }
}
