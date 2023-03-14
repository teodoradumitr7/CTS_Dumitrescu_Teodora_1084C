package cts.singleton;

public class Decan {
	private String nume;

	// eager initialization
	private static Decan instanta = new Decan("Ion");

	private Decan(String nume) {
		super();
		this.nume = nume;
	}

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public static Decan getInstanta() {
		return instanta;
	}

	@Override
	public String toString() {
		return "Decan [nume=" + nume + "]";
	}

}
