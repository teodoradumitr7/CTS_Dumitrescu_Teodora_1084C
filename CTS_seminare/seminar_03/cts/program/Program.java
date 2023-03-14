package cts.program;

import cts.singleton.registry.Firma;
import cts.singleton.registry.Registru;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Registru registru = new Registru();
		Registru registruNou=new Registru();
		Firma firma1 = registru.getFirma("Firma1");
		Firma firma2 = registru.getFirma("Firma2");
		Firma firma3 = registruNou.getFirma("Firma1");
		//Firma firma4=new Firma("Firma1",0);
		
		firma1.angajeaza();
		firma1.angajeaza();
		firma2.angajeaza();
		firma3.angajeaza();

		System.out.println(firma1.getNumarAngajati());
		System.out.println(firma2.getNumarAngajati());
		System.out.println(firma3.getNumarAngajati());
		
	
		

	}

}
