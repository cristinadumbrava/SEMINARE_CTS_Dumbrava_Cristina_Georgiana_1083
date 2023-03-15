package singleton_registry_nerecomandat.main;

import singleton_registry_nerecomandat.Firma;
import singleton_registry_nerecomandat.Registru;

public class Main {
    public static void main(String[] args) {
        Firma firma1 = Registru.getFirma("Friends SRL");
        Firma firma2 = Registru.getFirma("ASUD SRL");
        Firma firma3 = Registru.getFirma("Friends SRL");

        firma1.incheieContract(100);
        firma2.incheieContract(200);
        firma3.incheieContract(300);

        System.out.println(firma1.toString());
        System.out.println(firma2.toString());
        System.out.println(firma3.toString());

    }
}
