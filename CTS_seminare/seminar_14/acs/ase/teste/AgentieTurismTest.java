package acs.ase.teste;

import static org.junit.Assert.*;

import org.junit.Test;


import acs.ase.clase.AgentieTurism;
import acs.ase.clase.IPachetTuristic;
import acs.ase.mocks.FakePachetTuristic;


public class AgentieTurismTest {

    @Test
    void calculareSumaTotalaPachete() {
        AgentieTurism agentie=new AgentieTurism();
        IPachetTuristic p1=new FakePachetTuristic();
        IPachetTuristic p2=new FakePachetTuristic();
        IPachetTuristic p3=new FakePachetTuristic();

        p1.setPret(200.0);
        p2.setPret(300.0);
        p3.setPret(400.0);

        agentie.adaugaPachet(p1);
        agentie.adaugaPachet(p2);
        agentie.adaugaPachet(p3);

        assertEquals(900.0,agentie.calculareSumaTotalaPachete());

    }
}
