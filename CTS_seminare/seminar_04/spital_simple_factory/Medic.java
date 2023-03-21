package spital_simple_factory;

public class Medic implements PersonalSpital{

	private String nume;

	public Medic(String nume) {
		this.nume = nume;
	}

	@Override

	public void descriere() {
		System.out.println("Medicul " + this.nume);

	}

}
