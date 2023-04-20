package restaurant.adapter.main;

import restaurant.adapter.bar.ISoftBar;
import restaurant.adapter.bar.SoftBar;
import restaurant.adapter.bucatarie.AdapterRestaurant;
import restaurant.adapter.bucatarie.Bucatarie;
import restaurant.adapter.bucatarie.ISoftRestaurant;

public class Main {
	
	public static void imprimare(ISoftRestaurant restaurant,Double nota)
	{
		restaurant.printeazaNotaRestaurant(nota);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ISoftBar bar=new SoftBar("Alcadibo");
bar.printeazaNotaBauturi(240);

ISoftRestaurant bucatarie=new Bucatarie("George");
bucatarie.printeazaNotaRestaurant(300);


Main.imprimare(bucatarie, 300.0);
//Main.imprimare(bar, 300);

AdapterRestaurant adapter=new AdapterRestaurant("Alcadibo");
Main.imprimare(adapter, 400.0);
	}

}
