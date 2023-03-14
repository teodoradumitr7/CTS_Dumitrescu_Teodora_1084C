package cts.singleton;

public class Program {

	public static void main(String[] args) {
		/*
		Rector rector = Rector.getInstanta("Ion", 2, 40);
		Rector rectorNou = Rector.getInstanta("Vasile", 1, 45);

		System.out.println(rector.toString());
		System.out.println(rectorNou.toString());
		System.out.println();

		Decan decan = Decan.getInstanta();
		Decan decanNou = Decan.getInstanta();
		decanNou.setNume("Vasile");
		// modificarea se duce in ambele obj
		System.out.println(decan.toString());
		System.out.println(decanNou.toString());
		*/
		
		Firma firma1=Firma.getFirma("SC Firma1 SRL");
		Firma firma2=Firma.getFirma("SC Firma2 SRL");
		Firma firma3=Firma.getFirma("SC Firma1 SRL");
		
		firma1.setNumarAngajati(10);
		firma2.setNumarAngajati(15);
		firma3.setNumarAngajati(30);
		
		System.out.println(firma1.toString());
		System.out.println(firma2.toString());
		System.out.println(firma3.toString());
	}

}
