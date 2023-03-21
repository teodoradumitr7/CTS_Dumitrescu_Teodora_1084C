package spital_factory_method;

public class Medic implements PersonalSpital {
	private String nume;

	public Medic(String nume) {
		this.nume = nume;
	}

	@Override

	public void descriere() {
		System.out.println("Medicul " + this.nume);

	}
}
