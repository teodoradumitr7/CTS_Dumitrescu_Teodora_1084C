package template.main;

import template.clase.MasaLocal;
import template.clase.MasaRestaurant;
import template.clase.MasaRezervata;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MasaRestaurant masa1 = new MasaLocal(2);
		masa1.ocupareMasa();
		System.out.println();
		MasaRestaurant masa2=new MasaRezervata(2, "16.30");
		masa2.ocupareMasa();
	}

}
