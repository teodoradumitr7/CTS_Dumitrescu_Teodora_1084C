package decorator.main;

import decorator.clase.Decorator;
import decorator.clase.DecoratorNotaPlataLaMultiAni;
import decorator.clase.DecoratorNotaPlataPasteFericit;
import decorator.clase.INotaDePlata;
import decorator.clase.NotaDePlata;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		INotaDePlata notaPlata1 = new NotaDePlata("25/04/2023");
		notaPlata1.printeazaNotaDePlata(250);

		INotaDePlata notaPlata2 = new NotaDePlata("26/04/2023");
		notaPlata2.printeazaNotaDePlata(350);
		System.out.println();

		Decorator notaPlataPaste = new DecoratorNotaPlataPasteFericit(notaPlata2);
		notaPlataPaste.printeazaNotaDePlata(350);
		notaPlataPaste.printareFelicitare();
		System.out.println();
		
		Decorator notaPlatDecoratorLaMultiAni = new DecoratorNotaPlataLaMultiAni(notaPlataPaste);
		notaPlatDecoratorLaMultiAni.printeazaNotaDePlata(300);
		//decorare multipla, asa arata si paste fericit
		//notaPlatDecoratorLaMultiAni.printareFelicitare();

	}

}
