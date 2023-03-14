package cts.singleton.registry;

public class Firma {
	private String nume;
	private int numarAngajati;

	protected Firma(String nume, int numarAngajati) {
		super();
		this.nume = nume;
		this.numarAngajati = numarAngajati;
	}

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public int getNumarAngajati() {
		return numarAngajati;
	}

	public void setNumarAngajati(int numarAngajati) {
		this.numarAngajati = numarAngajati;
	}
	
	public void angajeaza() {
		this.numarAngajati++;
	}

	@Override
	public String toString() {
		return "Firma [nume=" + nume + ", numarAngajati=" + numarAngajati + "]";
	}
}
