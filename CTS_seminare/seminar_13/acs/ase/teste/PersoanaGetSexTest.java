package acs.ase.teste;

import static org.junit.Assert.*;

import org.junit.Test;

import acs.ase.clase.Persoana;
import acs.ase.clase.MyException;

public class PersoanaGetSexTest {

	@Test
	public void testGetRightSexMasc() {
		Persoana p=new Persoana("Tiberiu","5020419568425");
		assertEquals("M", p.getSex());
		
	}
	
	@Test
	public void testGetRightSexFem() {
		Persoana p2=new Persoana("Maria","6010519048756");
		assertEquals("F", p2.getSex());
		
	}
	
	@Test
	public void testGetBoundarySexMasc() {
		Persoana p=new Persoana("Tiberiu","1020419568425");
		assertEquals("M", p.getSex());
		
	}
	
	@Test
	public void testGetCrossCheckSexMasc() {
		Persoana p=new Persoana("Tiberiu","2020419568425");
		assertEquals(verificaImpar(p.CNP),p.getSex());
		
	}
	
	public String verificaImpar(String CNP) {
		int n=Integer.parseInt(""+CNP.charAt(0));
		if(n%2!=0)
		{
			return "M";
		}
		return "F";
	}
	
	@Test(expected =MyException.class)
	public void testGetSexError() {
		Persoana p=new Persoana("Tiberiu","9020419568425");
		p.getSex();
		
	}
	
	@Test(timeout=100)
	public void testGetSexPerformance() {
		Persoana p=new Persoana("Tiberiu","2020419568425");
		p.getSex();
	}
	
}
