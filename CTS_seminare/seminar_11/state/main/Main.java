package state.main;

import state.clase.Masa;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Masa masa=new Masa(1);
		
		masa.elibereazaMasa();
		masa.ocupaMasa();
		//masa.anuleazaRezervare();
		masa.rezervaMasa();
		masa.ridicaRezervare();
		masa.ocupaMasa();
		masa.elibereazaMasa();
		masa.rezervaMasa();

	}

}
