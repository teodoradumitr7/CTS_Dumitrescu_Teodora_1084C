package state.clase;

public class Ocupata implements Stare{

	@Override
	public void schimbaStare(Masa masa) {
		// TODO Auto-generated method stub
		if(!(masa.getStare() instanceof Ocupata))
		{
			masa.setStare(this);
			System.out.println("Masa "+masa.getNumar()+" a devenit ocupata.");
		}
		else {
			System.out.println("Masa este deja ocupata.");
		}
	}

}
