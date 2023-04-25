package decorator.clase;

public class DecoratorNotaPlataLaMultiAni extends Decorator {

	
	
	public DecoratorNotaPlataLaMultiAni(INotaDePlata notaDePlata) {
		super(notaDePlata);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void printeazaNotaDePlata(double totalPlata) {
		//printeaza pe nota
		super.printeazaNotaDePlata(totalPlata);
		System.out.println("La multi ani!");
		
	}

	@Override
	public void printareFelicitare() {
		// printeaza felicitare
		
		System.out.println("La multi ani!");
	}

}
