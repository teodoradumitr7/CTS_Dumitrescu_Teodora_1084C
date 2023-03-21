package spital_factory_method;

public class FactoryBrancardier implements Factory {

	@Override
	public PersonalSpital createPersonal(String nume) {
		// TODO Auto-generated method stub
		return new Brancardier(nume);
	}

}
