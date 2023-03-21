package simplefactory;

public class Factory {
    public PersonalSpital createObject(TipPersonal tipPersonal, String nume){
        switch(tipPersonal){
            case Brancardier:
                return new Brancardier(nume);
            case Medic:
                return new Medic(nume);
            case Asistent:
                return new Asistent(nume);
//            case Anestezist:
//                return new Anestezist(nume, 0); //apelam constructorul cu 2 param si setam al doilea param cu 0
            default:
                return null;
        }
    }

    public PersonalSpital createObject(TipPersonal tip, String nume, int nrPacienti){
        switch (tip){
            case Anestezist:
                return new Anestezist(nume, nrPacienti);
            default:
                return this.createObject(tip, nume);
        }
    }
}
