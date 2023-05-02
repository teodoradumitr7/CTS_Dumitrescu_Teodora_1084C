package strategy.clase;

public class PlataCash implements ModPlata{

	@Override
	public void plateste(String numeClient, double sumaPlata) {
		// TODO Auto-generated method stub
		System.out.println("Clientul "+numeClient+" plateste cash suma de "+sumaPlata);
		
	}

}
