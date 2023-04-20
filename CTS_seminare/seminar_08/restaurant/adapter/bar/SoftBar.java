package restaurant.adapter.bar;

public class SoftBar implements ISoftBar {
private String denumire;



public SoftBar(String denumire) {
	super();
	this.denumire = denumire;
	
}


@Override
public void printeazaNotaBauturi(double totalPlata) {
	System.out.println("Barul "+this.denumire
			+" a emis nota baturilor in valoare de "+totalPlata);
	
}


}
