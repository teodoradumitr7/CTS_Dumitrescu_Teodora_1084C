package state.clase;

public class Rezervata implements Stare{

	@Override
	public void schimbaStare(Masa masa) {
		// TODO Auto-generated method stub
		if(masa.getStare() instanceof Libera)
		{
			masa.setStare(this);
			System.out.println("Masa "+masa.getNumar()+" a devenit rezervata.");
		}
		else {
			System.out.println("Masa nu poate fi rezervata.");
		}
	}

}
