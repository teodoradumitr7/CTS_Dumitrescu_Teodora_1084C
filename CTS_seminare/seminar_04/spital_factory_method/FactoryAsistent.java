package spital_factory_method;

public class FactoryAsistent implements Factory {

	@Override
	public PersonalSpital createPersonal(String nume) {
		// TODO Auto-generated method stub
		return new Asistent(nume);
	}

}
