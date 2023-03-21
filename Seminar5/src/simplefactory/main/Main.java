package simplefactory.main;

import simplefactory.Asistent;
import simplefactory.Factory;
import simplefactory.PersonalSpital;
import simplefactory.TipPersonal;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args)
    {
        Factory factory = new Factory();
        PersonalSpital brancardier = factory.createObject(TipPersonal.Brancardier, "Andrei");
        PersonalSpital asistent = factory.createObject(TipPersonal.Asistent, "Matei");
        List<PersonalSpital> listaPersonal = new ArrayList<>();

        listaPersonal.add(brancardier);
        listaPersonal.add(asistent);
        listaPersonal.add((factory.createObject(TipPersonal.Medic, "George")));
        listaPersonal.add((factory.createObject(TipPersonal.Medic, "Alex")));
        listaPersonal.add((factory.createObject(TipPersonal.Asistent, "Toma")));
        listaPersonal.add((factory.createObject(TipPersonal.Brancardier, "Dan")));

        listaPersonal.add(factory.createObject(TipPersonal.Anestezist, "Gabi", 10));


        for(PersonalSpital personal : listaPersonal){
            personal.descriere();
        }


       //PersonalSpital p = new Asistent(); nu putem daca avem constructrorul protected

    }
}
