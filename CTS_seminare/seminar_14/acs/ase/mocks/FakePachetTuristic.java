package acs.ase.mocks;

import acs.ase.clase.IPachetTuristic;
import acs.ase.clase.IPersoana;

public class FakePachetTuristic implements IPachetTuristic{
    Double pret;
    String destinatie;

    @Override
    public Double getPret() {
        return pret;
    }

    @Override
    public IPersoana getClient() {
        return null;
    }

    @Override
    public String getDestinatie() {
        return destinatie;
    }

    @Override
    public boolean poateRezerva() {
        return false;
    }

    @Override
    public void aplicaDiscountVarstnici(int procent) {

    }

    @Override
    public void setClient(IPersoana client) {

    }

    @Override
    public void setPret(Double pret) {
this.pret=pret;
    }

    public  void setDestinatie(String destr){
        this.destinatie=destr;
    }
}

