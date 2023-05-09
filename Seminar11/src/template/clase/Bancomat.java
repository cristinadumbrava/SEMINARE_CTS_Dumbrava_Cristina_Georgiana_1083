package template.clase;

public class Bancomat extends BancomatAbstract{

    public Bancomat(String adresa) {
        super(adresa);
    }

    @Override
    protected void introduceCard() {
        System.out.println("A fost introdus cardul in bancomatul din " + super.getAdresa());
    }

    @Override
    protected void introducePin() {
        System.out.println("A fost introdus pinul in bancomatul din " + super.getAdresa());
    }

    @Override
    protected void specificareSuma(int valoare) {
        System.out.println("A fost specificata pentru retragere suma de " + valoare);
    }

    @Override
    protected void retrageSuma() {
        System.out.println("A fost retrasa suma solicitata din bancomatul de la " + super.getAdresa());
    }

    @Override
    protected void retrageCard() {
        System.out.println("A fost retras cardul din bancomatul de la " + super.getAdresa());
    }
}
