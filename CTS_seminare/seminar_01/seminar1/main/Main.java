package seminar1.main;

import seminar1.clase.ZooKeeper;
import seminar1.clase.Lion;
import seminar1.clase.Zebra;
import seminar1.clase.Zoo;
import seminar1.clase.Papagal;

public class Main {
	public static void main(String[] args) {
		ZooKeeper zooKeeper = new ZooKeeper("Ion");
		Zoo zoo = new Zoo("Zootropia", zooKeeper);
		
		zoo.addAnimal(new Zebra("Zebra1", 2));
		zoo.addAnimal(new Zebra("Zebra2", 5));
		zoo.addAnimal(new Lion("Leul1", 7));
		
		zoo.feedAllAnimals();
		
		zoo.addAnimal(new Lion("Leul2", 13));
		zoo.feedAllAnimals();
		
		zoo.addAnimal(new Papagal("Papagal1", 15));
		zoo.feedAllAnimals();
	}
}
