package decorator.clase;

public class NotaDePlata implements INotaDePlata {

	private String dataEmitere;

	public NotaDePlata(String dataEmitere) {
		super();
		this.dataEmitere = dataEmitere;
	}

	@Override
	public void printeazaNotaDePlata(double totalPlata) {
		// TODO Auto-generated method stub
		System.out.println("Nota dvs din data " + this.dataEmitere + " este in valoare de " + totalPlata);

	}

}
