package composite.clase;

import java.util.ArrayList;
import java.util.List;

public class Grup implements Element {
    private List<Element> elemente; //in lista avem autobuze si grupuri
    private String numeGrup;

    public Grup( String numeGrup) {
        this.elemente = new ArrayList<>();
        this.numeGrup = numeGrup;
    }

    @Override
    public float calculareSumaAsigurare() {
        //parcurgem lista si adunam
        float suma = 0;
        for(Element grupGeneral : elemente){
            suma += grupGeneral.calculareSumaAsigurare();
        }
        return suma;
    }

    @Override
    public void adaugaElement(Element grupGeneral) {
        this.elemente.add(grupGeneral);
    }

    @Override
    public void stergeGrup(Element grupGeneral) {
        this.elemente.remove(grupGeneral);
    }

    @Override
    public Element getGrup(int index) {
        return this.elemente.get(index);
    }

    @Override
    public void afisareSumaAsigurare() {
        float suma = calculareSumaAsigurare();
        System.out.println("Suma asigurarii este de: " + suma);
    }

    //un grup poate avea si doar un autobuz
}
