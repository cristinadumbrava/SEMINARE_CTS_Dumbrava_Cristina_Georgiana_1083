package template.clase;

public class BancomatBitcoin extends BancomatAbstract{
    public BancomatBitcoin(String adresa) {
        super(adresa);
    }

    @Override
    protected void introduceCard() {
        System.out.println("A fost introdus cardul bitcoin in bancomatul din " + super.getAdresa());
    }

    @Override
    protected void introducePin() {
        System.out.println("A fost introdus pin-ul pentru cardul bitcoin in bancomatul din " + super.getAdresa());
    }

    @Override
    protected void specificareSuma(int valoare) {
        System.out.println("A fost specificata suma de criptomoneda pentru retragere " + valoare);
    }

    @Override
    protected void retrageSuma() {
        System.out.println("A fost retrasa suma de criptomoneda solicitata din bancomatul de la " + super.getAdresa());
    }

    @Override
    protected void retrageCard() {
        System.out.println("A fost retras cardul bitcoin din bancomatul de la "+ super.getAdresa());
    }
}

//procesul e acelasi