package acs.ase.mocks;

import acs.ase.clase.IPersoana;

public class StubPersoanaVarstnica implements IPersoana{
    @Override
    public String getSex() {
        return "F";
    }

    @Override
    public int getVarsta() {
        return 75;
    }

    @Override
    public boolean checkCNP() {
        return true;
    }
}
