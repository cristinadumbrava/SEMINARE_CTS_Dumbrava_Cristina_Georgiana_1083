package prototype.classes;

import java.util.HashMap;
import java.util.Map;

public class Reteta implements Prototype{
    //colectie pt solutiile folosite in cadrul medicamentului + cantitate
    private Map<String, Float> solutii;
    private String nume;
    private Float gramajMedicament;

    public Reteta(Map<String, Float> solutii, String nume, Float gramajMedicament) {
        this.nume = nume;
        this.gramajMedicament = gramajMedicament;
        float suma = 0;
        for(Float valoare : solutii.values()){
            suma += valoare;
        }
        if(this.gramajMedicament > suma-0.1 && this.gramajMedicament < suma+0.1){
            this.solutii = solutii;
        }
        else{
            throw new IllegalArgumentException("Gramaj gresit!");
        }


    }

    private Reteta() {
        nume = null;
        gramajMedicament = null; //pt ca am folosit wrapper
        solutii = null;
    }

    @Override
    public Prototype clonare() {//am primit obiectul this
        Reteta reteta = new Reteta();
        reteta.nume = this.nume;
        reteta.gramajMedicament = this.gramajMedicament;
        reteta.solutii = new HashMap<>();
        for(String cheie : this.solutii.keySet()){
            reteta.solutii.put(cheie, this.solutii.get(cheie));
        }
        return reteta;
    }

    @Override
    public String toString() {
        return "Reteta{" +
                "solutii=" + solutii +
                ", nume='" + nume + '\'' +
                ", gramajMedicament=" + gramajMedicament +
                '}';
    }
}
