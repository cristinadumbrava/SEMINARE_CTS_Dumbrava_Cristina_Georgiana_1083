package state.clase;

public class StareLaCapatDeLinie implements IStare{
    @Override
    public void schimbaStareAutobuz(Autobuz autobuz) {
        if(autobuz.getStare() instanceof StareInCursa || autobuz.getStare() instanceof StareInService){
            System.out.println("Autobuzul" + autobuz.getNrInmatriculare() +
                    " a ajuns la capat de linie.");
            //daca e in starea ca e in cursa, atunci ii modificam starea in capat de linie
            autobuz.setStare(this);
        }
        else{
            System.out.println("Autobuzul " + autobuz.getNrInmatriculare() + " nu poate ajunge la capat de linie.");
        }
    }
}
