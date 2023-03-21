package spital_simple_factory;

public class Factory {
	public Factory() {

	}

	public PersonalSpital createInstance(TipPersonalSpital tipPersonalSpital, String nume) {
		switch (tipPersonalSpital) {
		case Medic:
			return new Medic(nume);
		case Asistent:
			return new Asistent(nume);
		case Brancardier:
			return new Brancardier(nume);
		case Anestezist:
			return new Anestezist(nume);
		default:
			return null;
		}
	}

}
