package command.main;

import command.clase.Autobuz;
import command.clase.CommandPlecareInCursa;
import command.clase.IAutomobil;
import command.clase.ManagerComenzi;

public class Main {
    public static void main(String[] args){
        ManagerComenzi managerComenzi = new ManagerComenzi();
        IAutomobil autobuz = new Autobuz(13);
        managerComenzi.invocaComanda(new CommandPlecareInCursa(10, new Autobuz(1)));
        managerComenzi.invocaComanda(new CommandPlecareInCursa(11, autobuz));
        managerComenzi.invocaComanda(new CommandPlecareInCursa(12, new Autobuz(3)));
        managerComenzi.invocaComanda(new CommandPlecareInCursa(11, autobuz));

        managerComenzi.executaComanda();
        managerComenzi.executaComanda();
        managerComenzi.invocaComanda(new CommandPlecareInCursa(10, new Autobuz(23)));
        managerComenzi.executaComanda();
        managerComenzi.executaComanda();
        managerComenzi.executaComanda();
    }
    //comanda de x si anuleaza -> folosim lista
    //anuleaza comanda, ne intoarcem la
    //anulez din stiva in ordinea inversa
}
