package builder.v1;

public class PacientBuilder implements Builder {
	private Pacient pacient;
	
	public PacientBuilder(String nume) {
		pacient=new Pacient();
		pacient.setNume(nume);
	}

	@Override
	public Pacient build() {
		return this.pacient;
	}

	public PacientBuilder setPatRabatabil(Boolean patRabatabil) {
		this.pacient.setPatRabatabil(patRabatabil);
		return this;
	}

	public PacientBuilder setMicDejun(Boolean micDejun) {
		this.pacient.setMicDejun(micDejun);
		return this;
	}
	
	public PacientBuilder setPapuciDeCamera(Boolean papuciDeCamera) {
		this.pacient.setPapuciDeCamera(papuciDeCamera);
		return this;
	}
	
//	public PacientBuilder setNume(String nume) {
//		this.pacient.setNume(nume);
//		return this;
//	}
}
