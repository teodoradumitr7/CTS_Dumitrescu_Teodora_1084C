package restaurant.proxy.clase;

public class Restaurant implements IRestaurant {

	private String nume;
	
	
	
	public Restaurant(String nume) {
		super();
		this.nume = nume;
	}



	@Override
	public void rezervaPersoane(int nrPers) {
		// TODO Auto-generated method stub
	System.out.println("Masa la rest "+this.nume+" pt "+nrPers+ " prsoane");
	}

}
