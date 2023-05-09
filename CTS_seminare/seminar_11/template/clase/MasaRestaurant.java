package template.clase;

public abstract class MasaRestaurant {
	private int numar;

	public MasaRestaurant(int numar) {
		super();
		this.numar = numar;
	}

	public int getNumar() {
		return numar;
	}

	protected abstract void curataMasa();

	protected abstract void aseazaServetele();

	protected abstract void aseazaTacamuri();

	protected abstract void invitaPersoane();
	
	public final void ocupareMasa() {
		curataMasa();
		aseazaServetele();
		aseazaTacamuri();
		invitaPersoane();
	}
	
}
