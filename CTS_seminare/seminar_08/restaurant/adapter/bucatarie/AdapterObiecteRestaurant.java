package restaurant.adapter.bucatarie;

import restaurant.adapter.bar.ISoftBar;

public class AdapterObiecteRestaurant implements ISoftRestaurant {

	private ISoftBar softBar;
	
	
	
	public AdapterObiecteRestaurant(ISoftBar softBar) {
		super();
		this.softBar = softBar;
	}



	@Override
	public void printeazaNotaRestaurant(double totalPlata) {
		// TODO Auto-generated method stub
		this.softBar.printeazaNotaBauturi(totalPlata);
	}

}
