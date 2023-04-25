package composite.clase;

public class Autobuz implements Element {
    private String producator;
    private int capacitateCilindrica;
    private int numarLocuri;

    public Autobuz(String producator, int capacitateCilindrica, int numarLocuri) {
        this.producator = producator;
        this.capacitateCilindrica = capacitateCilindrica;
        this.numarLocuri = numarLocuri;
    }

    @Override
    public float calculareSumaAsigurare() {
        float suma = (float)(1.5 * this.capacitateCilindrica);
        return suma;
    }

    @Override
    public void adaugaElement(Element grupGeneral) {
        //nu se aplica pe clasa noastra(nu e implementata pt nodul frunza), pt ca nu putem adauga un autobuz unui alt autobuz
        //throw new ExecutionControl.NotImplementedException("Nu este posibil!");
        throw new IllegalArgumentException("Operatia aceasta nu este implementata!");
    }

    @Override
    public void stergeGrup(Element grupGeneral) {
        throw new IllegalArgumentException("Operatia aceasta nu este implementata!");

    }

    @Override
    public Element getGrup(int index) {
        throw new IllegalArgumentException("Operatia aceasta nu este implementata!");
    }

    @Override
    public void afisareSumaAsigurare() {
        System.out.println("Suma de asigurare pentru autobuzul " + this.producator + " este de: " + this.calculareSumaAsigurare());
    }
}
