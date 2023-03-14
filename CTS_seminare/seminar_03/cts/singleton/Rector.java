package cts.singleton;

public class Rector {
	private String nume;
	private int numarMandate;
	private int varsta;

	// lazy initialization
	private static Rector instanta = null;

	private Rector(String nume, int numarMandate, int varsta) {
		super();
		this.nume = nume;
		this.numarMandate = numarMandate;
		this.varsta = varsta;
	}

	// secure pt lucrul pe threaduri ca e sincronizata
	public static synchronized Rector getInstanta(String nume, int nrMandate, int varsta) {
		if (instanta == null) {
			instanta = new Rector(nume, nrMandate, varsta);
		}
		return instanta;
	}

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public int getNumarMandate() {
		return numarMandate;
	}

	public void setNumarMandate(int numarMandate) {
		this.numarMandate = numarMandate;
	}

	public int getVarsta() {
		return varsta;
	}

	public void setVarsta(int varsta) {
		this.varsta = varsta;
	}

	@Override
	public String toString() {
		return "Rector [nume=" + nume + ", numarMandate=" + numarMandate + ", varsta=" + varsta + "]";
	}

}
