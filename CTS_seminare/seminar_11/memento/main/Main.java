package memento.main;

import memento.clase.Autobuz;
import memento.clase.OperatorAutobuz;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Autobuz autobuz=new Autobuz("Ion", Float.parseFloat("10.5"), "Otokar", "2015", 100);
		OperatorAutobuz operator=new OperatorAutobuz();
		operator.adaugaMemento(autobuz.creareMemento());
		System.out.println(autobuz.toString());
		System.out.println();
		autobuz.setNumeSofer("Vasle");
		autobuz.setConsumMediu(Float.parseFloat("15.5"));
		System.out.println(autobuz.toString());
		System.out.println();
		autobuz.restaurareAutobuz(operator.getMemento(0));
		System.out.println(autobuz.toString());
	}

}
