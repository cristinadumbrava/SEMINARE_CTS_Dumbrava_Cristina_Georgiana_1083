package cts.dubluri;

import cts.clase.IPersoana;

public class StubPersoanaMinora implements IPersoana {

    @Override
    public String getSex() {
        return "F";
    }

    @Override
    public int getVarsta() {
        return 17;
    }

    @Override
    public boolean checkCNP() {
        return false;
    }
}
