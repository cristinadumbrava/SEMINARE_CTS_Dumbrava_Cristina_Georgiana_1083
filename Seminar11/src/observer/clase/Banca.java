package observer.clase;

import java.util.ArrayList;
import java.util.List;

public class Banca implements IBanca{
    public List<IClient> listaClienti;
    public String numeBanca;

    public Banca(String numeBanca) {
        this.numeBanca = numeBanca;
        this.listaClienti = new ArrayList<>();
    }

    @Override
    public void adaugaObserver(IClient client) {
        this.listaClienti.add(client);
    }

    @Override
    public void stergeObserver(IClient client) {
        this.listaClienti.remove(client);
    }

    @Override
    public void notifica(String mesaj) {
        for(IClient observer : listaClienti){
            observer.afiseazaMesaj(mesaj);
        }
    }

    public void adaugaTipCreditNou(){
        this.notifica(numeBanca + ": Am adaugat un nou tip de credit in cazul in care doriti sa il accesati.");
    }

    public void actualizeazaAplicatie(){
        notifica(numeBanca + ": Aplicatia a fost actualizata.");
    }
}
