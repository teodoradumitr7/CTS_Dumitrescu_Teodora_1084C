package restaurant.adapter.bucatarie;

public class Bucatarie implements ISoftRestaurant{
private String numeBucatar;




public Bucatarie(String numeBucatar) {
	super();
	this.numeBucatar = numeBucatar;
	
}



@Override
public void printeazaNotaRestaurant(double totalPlata) {
	System.out.println("Bucatarul "+this.numeBucatar);
	System.out.println("Nota dv in valoare de "+totalPlata);
	
}
}
