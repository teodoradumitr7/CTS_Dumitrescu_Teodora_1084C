package acs.ase.teste;

import static org.junit.Assert.*;

import org.junit.Test;

import acs.ase.clase.PachetTuristic;
import acs.ase.mocks.FakePerson;

public class PachetTuristicVarstaTest {

    @Test
    public void unTanarNuPoateRezerva() {
        FakePerson pers=new FakePerson();
        pers.setVarsta(16);
        PachetTuristic pachet=new PachetTuristic(pers,"Bucuresti",20.0);
        assertFalse(pachet.poateRezerva());

    }

    @Test
    public void unAdultPoateRezerva() {
        FakePerson pers=new FakePerson();
        pers.setVarsta(30);
        PachetTuristic pachet=new PachetTuristic(pers,"Bucuresti",20.0);
        assertTrue(pachet.poateRezerva());

    }
}
