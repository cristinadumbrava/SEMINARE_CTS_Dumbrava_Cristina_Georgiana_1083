package composite.clase;

public interface Element {
    public float calculareSumaAsigurare();
    public void adaugaElement(Element grupGeneral);
    public void stergeGrup(Element grupGeneral);
    public Element getGrup(int index);
    public void afisareSumaAsigurare();
}
