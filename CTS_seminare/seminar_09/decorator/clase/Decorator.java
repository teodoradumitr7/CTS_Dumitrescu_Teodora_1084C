package decorator.clase;

//la cls abstracta nu ma obliga sa implementez cls
public abstract class Decorator implements INotaDePlata {
	private INotaDePlata notaDePlata;

	public Decorator(INotaDePlata notaDePlata) {
		super();
		this.notaDePlata = notaDePlata;
	}

	@Override
	public void printeazaNotaDePlata(double total) {
		this.notaDePlata.printeazaNotaDePlata(total);
	}
	
	public abstract void printareFelicitare();
}
