package spital_factory_method;

public class Asistent implements PersonalSpital {
	private String nume;

	public Asistent(String nume) {
		this.nume = nume;
	}

	@Override

	public void descriere() {
		System.out.println("Asistent " + this.nume);

	}
}
