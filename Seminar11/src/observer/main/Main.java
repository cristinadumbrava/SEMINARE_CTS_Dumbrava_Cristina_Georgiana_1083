package observer.main;

import observer.clase.Banca;
import observer.clase.Client;
import observer.clase.IClient;

public class Main {
    public static void main(String[] args){
        Banca banca1  = new Banca("BCR");
        IClient client1 = new Client("Andrei");
        IClient client2 = new Client("Matei");
        IClient client3 = new Client("Victor");
        banca1.actualizeazaAplicatie();

        banca1.adaugaObserver(client1);
        banca1.adaugaTipCreditNou();

        banca1.adaugaObserver(client2);
        banca1.adaugaObserver(client3);
        banca1.stergeObserver(client1);

        banca1.actualizeazaAplicatie();
    }
}
