package restaurant.proxy.main;

import restaurant.proxy.clase.IRestaurant;
import restaurant.proxy.clase.ProxyRestaurant;
import restaurant.proxy.clase.Restaurant;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
IRestaurant restaurant=new Restaurant("Hush");
restaurant.rezervaPersoane(2);

IRestaurant proxy=new ProxyRestaurant(restaurant);
proxy.rezervaPersoane(4);
proxy.rezervaPersoane(2);
	}

}
