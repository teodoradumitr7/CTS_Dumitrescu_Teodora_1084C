package seminar1.clase;

public class ZooKeeper {
	private String nume;
	
	public ZooKeeper(String nume) {
		this.nume = nume;
	}
	
	public void feedAnimal(Animal a)
	{
		a.eat(nume);
	}
}
