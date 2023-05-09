package template.clase;

public abstract class BancomatAbstract {
    private String adresa;

    public BancomatAbstract(String adresa) {
        this.adresa = adresa;
    }

    public String getAdresa() {
        return adresa;
    }

    protected abstract void introduceCard(); //avem acces si in interiorul clasei care o vor mosteni
    protected abstract void introducePin();
    protected abstract void specificareSuma(int valoare);
    protected abstract void retrageSuma();
    protected abstract void retrageCard();

    //metoda finala - nu ma lase sa o suprascriu; metoda care implementeaza template; pasii pe care trb sa i parcurgem
    public final void scoateBaniDeLaBancomat(int suma){
        introduceCard();
        introducePin();
        specificareSuma(suma);
        retrageSuma();
        retrageCard();
    }

}
