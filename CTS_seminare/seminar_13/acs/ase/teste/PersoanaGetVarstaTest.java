package acs.ase.teste;

import static org.junit.Assert.*;

import org.junit.Test;

import acs.ase.clase.Persoana;
import acs.ase.clase.MyException;

public class PersoanaGetVarstaTest {

	@Test
	public void testGetRightVarsta() {
		Persoana p=new Persoana("Tiberiu","5020419568425");
		assertEquals(21, p.getVarsta());
		
	}
	
	@Test
	public void testGetVarstaBoundaryNouNascut() {
		Persoana p=new Persoana("Tiberiu","5230521035874");
		assertEquals(0, p.getVarsta());
		
	}
	
	@Test
	public void getVarstaBoundaryAn2000() {
		Persoana p=new Persoana("Tiberiu","5000101035874");
		assertEquals(23, p.getVarsta());
	}
	
	@Test
	public void getVarstaBoundaryAn1900() {
		Persoana p=new Persoana("Tiberiu","1000101035874");
		assertEquals(123, p.getVarsta());
	}
	
	@Test
	public void getVarstaBoundaryAn1999() {
		Persoana p=new Persoana("Tiberiu","1991231035874");
		assertEquals(23, p.getVarsta());
	}
	//nu se poate face test de invers
	//nici cross check ca fara calculele din get varsta nu avem cum fara
	
	@Test(expected=MyException.class)
	public void getVarstaException() {
		Persoana p=new Persoana("Tiberiu","5230525035874");
		p.getVarsta();
		
	}
	//alte teset de exceptie
	//luna peste 12
	//ziua peste 28,28,30,31
	@Test(timeout=100)
	public void testGetVarstaPerformance() {
		Persoana p=new Persoana("Tiberiu","2020419568425");
		p.getVarsta();
	}
	
	//teste conformance
	//check CNP sa fie de 13 caractere
	//teste luna si ziua, luna interval 0-11, ziua la fel
	
	//ordinea- pt testele 1999 si 2000 care e mai mare si care e mai mic, sa fie o ordine exacta dpdv al varstei
	
	//range am fct la boundary unde am stabilit intervalele
	
	//reference
	
	//existance
	//error condition-daca exista ziua respectiva, nu peste 30
	//daca exista luna, de exemplu 14
}
