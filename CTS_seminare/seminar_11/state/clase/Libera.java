package state.clase;

public class Libera implements Stare{

	@Override
	public void schimbaStare(Masa masa) {
		// TODO Auto-generated method stub
		if(!(masa.getStare() instanceof Libera))
		{
			masa.setStare(this);
			System.out.println("Masa "+masa.getNumar()+" a devenit libera.");
		}
		else {
			System.out.println("Masa este deja libera.");
		}
	}

}
