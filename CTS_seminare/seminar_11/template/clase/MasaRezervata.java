package template.clase;

public class MasaRezervata extends MasaRestaurant{
	private String oraRezervarii;
	

	public MasaRezervata(int numar, String oraRezervarii) {
		super(numar);
		this.oraRezervarii=oraRezervarii;
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void curataMasa() {
		// TODO Auto-generated method stub
		System.out.println("Chelnerul curata masa " +this.getNumar()+" pentru cei care vor ridica rezervarea la ora "+this.oraRezervarii);
		
	}

	@Override
	protected void aseazaServetele() {
		// TODO Auto-generated method stub
		System.out.println("Chelnerul aseaza servetele pe masa " +this.getNumar()+" pentru cei care vor ridica rezervarea la ora "+this.oraRezervarii);
		
	}

	@Override
	protected void aseazaTacamuri() {
		// TODO Auto-generated method stub
		System.out.println("Chelnerul aseaza tacamurile pe masa " +this.getNumar()+" pentru cei care vor ridica rezervarea la ora "+this.oraRezervarii);
					
	}

	@Override
	protected void invitaPersoane() {
		// TODO Auto-generated method stub
		System.out.println("Va asteptam la masa " +this.getNumar()+" la ora "+this.oraRezervarii);
	}

}
