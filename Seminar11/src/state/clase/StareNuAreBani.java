package state.clase;

public class StareNuAreBani implements IStare{
    @Override
    public void modificaStare(Bancomat bancomat) { //daca are pinul introdus trece in aceasta stare
        if(bancomat.getStare() instanceof StareArePinIntrodus){
            bancomat.setStare(this);
            System.out.println("Bancomatul nu are bani.");
        }
        else{
            System.out.println("Cardul a fost scos.");
        }
    }
}
