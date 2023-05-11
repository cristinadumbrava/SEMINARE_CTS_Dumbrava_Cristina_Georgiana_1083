package state.clase;

public interface IStare {
    //definim doar actiunea de schimbare a starii

    void schimbaStareAutobuz(Autobuz autobuz);

    //putem pune aici cererile (functiile), iar apoi le implementam in starile concrete
    //dar nu le implementam pe cele care nu sunt potrivite pentru clasa respectiva si afisam un mesaj

}
