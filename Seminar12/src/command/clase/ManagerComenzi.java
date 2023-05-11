package command.clase;

import java.util.ArrayList;
import java.util.List;

public class ManagerComenzi {
    //nu cu stack - daca a plecat in cursa, nu ii pot spune sa se intoarca
    private List<ICommand> comenzi = new ArrayList<>(); //coada

    //invoc
    public void invocaComanda(ICommand command){
        //in coada pune toate comenzile; invoca mai multe comenzi pe care le salveaza in coada
        comenzi.add(command);
    }

    //cand am autobuze libere, ii spune sa mearga pe linia x

    //decuplare - execut
    public void executaComanda(){ //nu ii dau ce comanda sa execute, pt ca se executa in continuare crescator
        if(this.comenzi.size() != 0) {
            //comanda o luam din coada (urmatoarea)
            this.comenzi.get(0).executa(); //executa prima comanda
            this.comenzi.remove(this.comenzi.get(0)); //o stergem dupa ce o executam
        }
    }
}
