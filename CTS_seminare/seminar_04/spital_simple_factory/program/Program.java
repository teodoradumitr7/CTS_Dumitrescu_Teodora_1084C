package spital_simple_factory.program;

import java.util.ArrayList;
import java.util.List;

import spital_simple_factory.Factory;
import spital_simple_factory.PersonalSpital;
import spital_simple_factory.TipPersonalSpital;

public class Program {
	public static void main(String[] args) {
		Factory factory = new Factory();

		PersonalSpital asistent = factory.createInstance(TipPersonalSpital.Asistent, "Ion");
		PersonalSpital medic = factory.createInstance(TipPersonalSpital.Medic, "Gheorghe");
		PersonalSpital brancardier = factory.createInstance(TipPersonalSpital.Brancardier, "Mircea");

		asistent.descriere();
		medic.descriere();
		brancardier.descriere();
		
		List<PersonalSpital> listaPersonal=new ArrayList<>();
		listaPersonal.add(asistent);
		listaPersonal.add(brancardier);
		listaPersonal.add(medic);
		listaPersonal.add(factory.createInstance(TipPersonalSpital.Asistent, "Ioana"));
		listaPersonal.add(factory.createInstance(TipPersonalSpital.Medic, "Maria"));
		listaPersonal.add(factory.createInstance(TipPersonalSpital.Brancardier, "Elena"));
		listaPersonal.add(factory.createInstance(TipPersonalSpital.Asistent, "Vasile"));
		listaPersonal.add(factory.createInstance(TipPersonalSpital.Medic, "Ana"));
		listaPersonal.add(factory.createInstance(TipPersonalSpital.Medic, "Ileana"));
		
		for(PersonalSpital persoana:listaPersonal) {
			persoana.descriere();
		}
		
	}
}
