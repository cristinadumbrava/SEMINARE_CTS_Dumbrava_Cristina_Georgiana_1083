package cts.dubluri;

import cts.clase.IPersoana;

//stub ul trebuie sa ia locul unei persoane reale, deci trb sa implementam interfata

public class StubPersoana implements IPersoana {


    @Override
    public String getSex() {
        return "M";
    }

    @Override
    public int getVarsta() {
        return 21;
    }

    @Override
    public boolean checkCNP() {
        return true;
    }
}
