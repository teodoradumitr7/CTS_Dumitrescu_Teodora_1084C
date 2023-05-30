package acs.ase.mocks;

import acs.ase.clase.IPersoana;

public class FakePerson implements IPersoana{

    private String sex;
    private int varsta;
    private boolean CNP;

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public void setCNP(boolean CNP) {
        this.CNP = CNP;
    }

    @Override
    public String getSex() {
        return sex;
    }

    @Override
    public int getVarsta() {
        return varsta;
    }

    @Override
    public boolean checkCNP() {
        return CNP;
    }
}

