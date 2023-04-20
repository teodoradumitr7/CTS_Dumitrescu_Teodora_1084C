package seminar1.clase;

public abstract class Animal {
	private String nume;
	private int varsta;
	
	public abstract void eat(String numeIngrijitor);

	public Animal(String nume, int varsta) {
		super();
		this.nume = nume;
		this.varsta = varsta;
	}

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public int getVarsta() {
		return varsta;
	}

	public void setVarsta(int varsta) {
		this.varsta = varsta;
	}
	
	
}
