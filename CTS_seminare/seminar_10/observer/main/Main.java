package observer.main;

import observer.clase.ClientRestaurant;
import observer.clase.Observer;
import observer.clase.Restaurant;
import observer.clase.Subject;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Restaurant restaurant=new Restaurant("Bonita");
		
		Observer client1=new ClientRestaurant("Vlad");
		Observer client2=new ClientRestaurant("Bogdan");
		Observer client3=new ClientRestaurant("Mihai");
		
		restaurant.adaugaObserver(client1);
		restaurant.adaugaObserver(client2);
		restaurant.notificaOfertaPret();
		
		restaurant.stergeObserver(client2);
		restaurant.adaugaObserver(client3);
		restaurant.notificSchimbareMeniu();
		
	}

}
