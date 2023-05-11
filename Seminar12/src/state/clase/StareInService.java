package state.clase;

public class StareInService implements IStare{
    @Override
    public void schimbaStareAutobuz(Autobuz autobuz) {
        if(autobuz.getStare() instanceof StareLaCapatDeLinie){
            System.out.println("Autobuzul " + autobuz.getNrInmatriculare() + " e in service.");
            autobuz.setStare(this);
        }else {
            System.out.println("Autobuzul" + autobuz.getNrInmatriculare() + " nu poate ajunge la service.");
        }
    }
}
