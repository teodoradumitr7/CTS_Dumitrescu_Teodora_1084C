package composite.clase;

public class Produs implements Item{
	
	String nume;
	

	public Produs(String nume) {
		super();
		this.nume = nume;
	}

	@Override
	public void adaugareItem(Item item) throws Exception {
		// TODO Auto-generated method stub
		throw new Exception("adaugare nu e impl");
		
	}

	@Override
	public void stergereItem(Item item) throws Exception {
		// TODO Auto-generated method stub
		throw new Exception("stergere nu e impl");
		
	}

	@Override
	public void descriere(String indentare) {
		// TODO Auto-generated method stub
		System.out.println(indentare +this.nume);
	}

	@Override
	public Item getItem(int index) throws Exception {
		// TODO Auto-generated method stub
		throw new Exception("getItem nu e impl");
	}

}
