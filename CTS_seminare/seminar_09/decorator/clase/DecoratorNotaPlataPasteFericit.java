package decorator.clase;

public class DecoratorNotaPlataPasteFericit extends Decorator{

	public DecoratorNotaPlataPasteFericit(INotaDePlata notaDePlata) {
		super(notaDePlata);
		// TODO Auto-generated constructor stub
	}

	

	@Override
	public void printareFelicitare() {
		// TODO Auto-generated method stub
		System.out.println("Paste fericit");
		
	}


	public void printeazaNotaDePlata(double totalPlata) {
		//printeaza pe nota
		super.printeazaNotaDePlata(totalPlata);
		System.out.println("Paste fericit!");
		
	}
	
}
