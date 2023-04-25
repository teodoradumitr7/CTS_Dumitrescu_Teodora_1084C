package composite.main;

import composite.clase.Item;
import composite.clase.Produs;
import composite.clase.Sectiune;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Item meniu=new Sectiune("Meniu restaurant");
		
		Item sectiuneBauturi=new Sectiune("bauturi");
		Item sectiuneStarter=new Sectiune("sterter");
		Item sectiuneDesert=new Sectiune("desert");
		
		Item subsCafele=new Sectiune("cafele");
		Item subsSucuri=new Sectiune("sucuri");
		
		Item cafeaNeagra=new Produs("cafea neagra");
		Item cafeaArabica=new Produs("cafea arabica");
		
		Item cocaCola=new Produs("cocaCola");
		Item pepsi=new Produs("pepsi");
		
		Item apaPlata=new Produs("apa plata");
		
		Item bruschete=new Produs("bruschete");
		
		try {
			subsCafele.adaugareItem(cafeaNeagra);
			subsCafele.adaugareItem(cafeaArabica);
			
			subsSucuri.adaugareItem(cocaCola);
			subsSucuri.adaugareItem(pepsi);
			
			sectiuneBauturi.adaugareItem(subsCafele);
			sectiuneBauturi.adaugareItem(subsSucuri);
			sectiuneBauturi.adaugareItem(apaPlata);
			
			sectiuneStarter.adaugareItem(bruschete);
			
			meniu.adaugareItem(sectiuneBauturi);
			meniu.adaugareItem(sectiuneStarter);
			
			meniu.descriere(" ");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
