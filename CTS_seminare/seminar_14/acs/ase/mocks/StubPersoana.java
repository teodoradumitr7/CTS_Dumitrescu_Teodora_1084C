package acs.ase.mocks;

import acs.ase.clase.IPersoana;

public class StubPersoana implements IPersoana{
    @Override
    public String getSex() {
        return "M";
    }

    @Override
    public int getVarsta() {
        return 20;
    }

    @Override
    public boolean checkCNP() {
        return false;
    }
}
