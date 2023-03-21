package spital_factory_method;

public class Brancardier implements PersonalSpital {

	private String nume;

	public Brancardier(String nume) {
		this.nume = nume;
	}

	@Override

	public void descriere() {
		System.out.println("Brancardier " + this.nume);

	}
}
