package composite.main;

import composite.clase.Autobuz;
import composite.clase.Element;
import composite.clase.Grup;

public class Main {
    public static void main(String[] args){
        Element autobuz1 = new Autobuz("Mercedes", 3000, 9);
        Element autobuz2 = new Autobuz("Mercedes", 3000, 7);
        //creare grup de tip element
        Element grupAutobuzeMici= new Grup("Autobuze mici");
        grupAutobuzeMici.adaugaElement(autobuz1);
        grupAutobuzeMici.adaugaElement(autobuz2);
        //asigurare pentru intregul grup
        grupAutobuzeMici.afisareSumaAsigurare();

        Element grupAutobuzeMijlocii = new Grup("Autobuze mijlocii");
        Element autobuz3 = new Autobuz("Mercedes", 4000, 15);
        Element autobuz4 = new Autobuz("Mercedes", 5000, 17);

        grupAutobuzeMijlocii.adaugaElement(autobuz3);
        grupAutobuzeMijlocii.adaugaElement(autobuz4);
        grupAutobuzeMijlocii.afisareSumaAsigurare();

        //adaugam ambele grupuri in cadrul unei flote
        Element flota = new Grup("Autobuze");
        flota.adaugaElement(grupAutobuzeMici);
        flota.adaugaElement(grupAutobuzeMijlocii);
        flota.afisareSumaAsigurare();

        //adaugara autobuz in flota; acum am si elemente de nod frunza si elemente de tip composite
        Element autobuzNou = new Autobuz("Mercedes", 4000, 20);
        flota.adaugaElement(autobuzNou);
        flota.afisareSumaAsigurare();
    }

}
