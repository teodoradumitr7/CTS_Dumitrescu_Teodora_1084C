package seminar1.clase;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
	private String nume;
	private ZooKeeper zooKeeper;
	private List<Animal> animals;
	
	public Zoo(String nume, ZooKeeper zooKeeper) {
		super();
		this.nume = nume;
		this.zooKeeper = zooKeeper;
		this.animals = new ArrayList<Animal>();
	}
	

	public void feedAllAnimals()
	{
		for(int i = 0; i < animals.size(); i++) {
			zooKeeper.feedAnimal(animals.get(i));
		}
	}
	
	public void addAnimal(Animal animal) {
		animals.add(animal);
	}
	
	public void deleteAnimal(Animal animal) {
		animals.remove(animal);
	}
}