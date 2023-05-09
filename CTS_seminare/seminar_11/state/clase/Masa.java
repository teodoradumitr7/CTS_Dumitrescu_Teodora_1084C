package state.clase;

public class Masa {

	private int numar;
	private Stare stare;
	public Masa(int numar) {
		super();
		this.numar = numar;
		stare=new Libera();
	}
	public int getNumar() {
		return numar;
	}
	public void setNumar(int numar) {
		this.numar = numar;
	}
	public Stare getStare() {
		return stare;
	}
	protected void setStare(Stare stare) {
		this.stare = stare;
	}
	
	public void rezervaMasa() {
		Stare rezervata=new Rezervata();
		rezervata.schimbaStare(this);
	}
	
	public void ocupaMasa() {
		Stare ocupata=new Ocupata();
		ocupata.schimbaStare(this);
	}
	
	public void elibereazaMasa() {
		Stare libera=new Libera();
		libera.schimbaStare(this);
	}
	
	public void ridicaRezervare() {
		Stare ocupata=new Ocupata();
		ocupata.schimbaStare(this);
	}
	
	public void anuleazaRezervare() {
		Stare libera=new Libera();
		libera.schimbaStare(this);
	}
}
