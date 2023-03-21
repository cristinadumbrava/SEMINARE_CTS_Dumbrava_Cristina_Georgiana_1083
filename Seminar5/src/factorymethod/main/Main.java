package factorymethod.main;

import factorymethod.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        Factory factoryMedici = new FactoryMedic();
        Factory factoryAsistenti = new FactoryAsistent();
        Factory factoryBrancardieri = new FactoryBrancardier();

        List<PersonalSpital> listaPersonal = new ArrayList<>();
        listaPersonal.add(factoryAsistenti.createObject("Ionescu"));
        listaPersonal.add(factoryMedici.createObject("Matei"));
        listaPersonal.add(factoryAsistenti.createObject("Andrei"));
        listaPersonal.add(factoryAsistenti.createObject("Adi"));
        listaPersonal.add(factoryBrancardieri.createObject("Cristi"));


        for(PersonalSpital p : listaPersonal){
            p.descriere();
        }


    }
}
