package facade.clase;

public class Masa {
	private boolean masaLibera;
	private int nrMasa;
	private boolean areServetele;

	public Masa(boolean masaLibera, int nrMasa, boolean areServetele) {
		super();
		this.masaLibera = masaLibera;
		this.nrMasa = nrMasa;
		this.areServetele = areServetele;
	}

	public boolean isMasaLibera() {
		return masaLibera;
	}

	public void setMasaLibera(boolean masaLibera) {
		this.masaLibera = masaLibera;
	}

	public int getNrMasa() {
		return nrMasa;
	}

	public void setNrMasa(int nrMasa) {
		this.nrMasa = nrMasa;
	}

	public boolean isAreServetele() {
		return areServetele;
	}

	public void setAreServetele(boolean areServetele) {
		this.areServetele = areServetele;
	}

}
