package builder.v1;

public class Pacient {
	private String nume="Anonim";
	private Boolean patRabatabil;
	private Boolean micDejun;
	private Boolean papuciDeCamera;

	public Pacient(String nume, Boolean patRabatabil, Boolean micDejun, Boolean papuciDeCamera) {
		super();
		this.nume = nume;
		this.patRabatabil = patRabatabil;
		this.micDejun = micDejun;
		this.papuciDeCamera = papuciDeCamera;
	}

	public Pacient() {
		super();
		this.patRabatabil = false;
		this.micDejun = false;
		this.papuciDeCamera = false;
	}
	
	public String getNume() {
		return nume;
	}

	protected void setNume(String nume) {
		this.nume = nume;
	}

	public Boolean getPatRabatabil() {
		return patRabatabil;
	}

	protected void setPatRabatabil(Boolean patRabatabil) {
		this.patRabatabil = patRabatabil;
	}

	public Boolean getMicDejun() {
		return micDejun;
	}

	protected void setMicDejun(Boolean micDejun) {
		this.micDejun = micDejun;
	}

	public Boolean getPapuciDeCamera() {
		return papuciDeCamera;
	}

	protected void setPapuciDeCamera(Boolean papuciDeCamera) {
		this.papuciDeCamera = papuciDeCamera;
	}

	@Override
	public String toString() {
		return "Pacient [nume=" + nume + ", patRabatabil=" + patRabatabil + ", micDejun=" + micDejun
				+ ", papuciDeCamera=" + papuciDeCamera + "]";
	}

}
