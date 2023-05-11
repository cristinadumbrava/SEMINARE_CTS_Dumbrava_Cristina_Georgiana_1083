package state.clase;

public class StareInCursa implements IStare{
    @Override
    public void schimbaStareAutobuz(Autobuz autobuz) {
        if(autobuz.getStare() instanceof StareLaCapatDeLinie){
            System.out.println("Autobuzul " + autobuz.getNrInmatriculare() + " pleaca intr-o noua cursa.");
            autobuz.setStare(this);
        }
        else{
            System.out.println("Autobuzul " + autobuz.getNrInmatriculare() + " nu poate pleca in noua cursa.");
        }
    }
}
