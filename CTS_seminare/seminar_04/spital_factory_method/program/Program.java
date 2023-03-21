package spital_factory_method.program;

import java.util.ArrayList;
import java.util.List;

import spital_factory_method.Factory;
import spital_factory_method.FactoryAnestezist;
import spital_factory_method.FactoryAsistent;
import spital_factory_method.FactoryInfirmier;
import spital_factory_method.FactoryMedic;
import spital_factory_method.Infirmier;
import spital_factory_method.PersonalSpital;

public class Program {

	public static void main(String[] args) {
		Factory fabricaAsistenti=new FactoryAsistent();
		Factory fabricaMedici=new FactoryMedic();
		Factory fabricaAnestezist=new FactoryAnestezist();
		Factory fabricaInfirmier=new FactoryInfirmier();
		Infirmier infirmier=(Infirmier) fabricaInfirmier.createPersonal("Alexandru");
		infirmier.setAniVechime(10);
		
		List<PersonalSpital> listaPersonal=new ArrayList<PersonalSpital>();
		listaPersonal.add(fabricaAsistenti.createPersonal("Popescu"));
		listaPersonal.add(fabricaAsistenti.createPersonal("Ion"));
		listaPersonal.add(fabricaMedici.createPersonal("Ioana"));
		listaPersonal.add(infirmier);
		
		for(PersonalSpital persoana: listaPersonal) {
			persoana.descriere();
		}
		
		

	}

}
