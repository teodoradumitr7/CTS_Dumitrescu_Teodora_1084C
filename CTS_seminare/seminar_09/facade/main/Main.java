package facade.main;

import facade.clase.FacadeRestaurant;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FacadeRestaurant fatada=new FacadeRestaurant();
		System.out.println(fatada.verificareDisponibilitateMasa(1));
		System.out.println(fatada.verificareDisponibilitateMasa(2));
		System.out.println(fatada.verificareDisponibilitateMasa(3));

	}

}
