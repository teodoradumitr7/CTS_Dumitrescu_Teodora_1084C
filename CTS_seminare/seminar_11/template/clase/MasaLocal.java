package template.clase;

public class MasaLocal extends MasaRestaurant{

	public MasaLocal(int numar) {
		super(numar);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void curataMasa() {
		// TODO Auto-generated method stub
		System.out.println("Chelnerul curata masa " +this.getNumar()+" deoarece persoanele asteapta la usa");
		
	}

	@Override
	protected void aseazaServetele() {
		// TODO Auto-generated method stub
		System.out.println("Chelnerul aseaza servetele pe masa " +this.getNumar()+" deoarece persoanele asteapta la usa");
		
	}

	@Override
	protected void aseazaTacamuri() {
		// TODO Auto-generated method stub
		System.out.println("Chelnerul aseaza tacamuri pe masa " +this.getNumar()+" deoarece persoanele asteapta la usa");
		
	}

	@Override
	protected void invitaPersoane() {
		// TODO Auto-generated method stub
		System.out.println("Chelnerul invita la masa " +this.getNumar()+" persoanele care asteapta la usa");
	}

}
