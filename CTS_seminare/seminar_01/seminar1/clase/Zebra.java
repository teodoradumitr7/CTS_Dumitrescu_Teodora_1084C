package seminar1.clase;

public class Zebra extends Animal{

	public Zebra(String nume, int varsta) {
		super(nume, varsta);
	}

	@Override
	public void eat(String numeIngrijitor) {
		System.out.println("Zebra " + this.getNume() + " are " + this.getVarsta() 
		+ " ani si a fost hranita de catre ingrijitorul " + numeIngrijitor);

	}

}
