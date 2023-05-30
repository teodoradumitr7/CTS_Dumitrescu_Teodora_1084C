package acs.ase.teste;

import static org.junit.Assert.*;

import org.junit.Test;

import acs.ase.clase.IPersoana;
import acs.ase.clase.PachetTuristic;
import acs.ase.mocks.StubPersoana;
import acs.ase.mocks.StubPersoanaVarstnica;

public class PachetTuristicTest {
    @Test
    void checkIfAplicaDiscountDoesntApplyForYoungPeople(){
        IPersoana pers=new StubPersoana();
        PachetTuristic pachet=new PachetTuristic(pers,"Bucuresti",10.0);
        pachet.aplicaDiscountVarstnici(20);
        assertEquals(10.0,(double)pachet.getPret());
    }

    @Test
    void checkIfAplicaDiscountWorksForEldery(){
        IPersoana pers=new StubPersoanaVarstnica();
        PachetTuristic pachet=new PachetTuristic(pers,"Cluj",10.0);
        pachet.aplicaDiscountVarstnici(20);
        assertEquals(8.0,(double)pachet.getPret());
    }
}
