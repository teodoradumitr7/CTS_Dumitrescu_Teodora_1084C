package restaurant.proxy.clase;

public class ProxyRestaurant  implements IRestaurant{
	private IRestaurant restaurant;
	
	
	public ProxyRestaurant(IRestaurant restaurant) {
		super();
		this.restaurant = restaurant;
	}


	@Override
	public void rezervaPersoane(int nrPers) {
		// TODO Auto-generated method stub
		if(nrPers>=4) {
			this.restaurant.rezervaPersoane(nrPers);
		}
		else {
			System.out.println("Rezervarea nu a putut fi facuta");
		}
	}

}
