package spital_factory_method;

public class FactoryMedic implements Factory{

	@Override
	public PersonalSpital createPersonal(String nume) {
		// TODO Auto-generated method stub
		return new Medic(nume);
	}

}
