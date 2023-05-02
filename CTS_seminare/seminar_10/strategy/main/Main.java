package strategy.main;

import strategy.clase.Client;
import strategy.clase.PlataCard;
import strategy.clase.PlataCash;

public class Main {
public static void main(String[] args) {
	Client client1=new Client("Maria");
	
	client1.realizeazaPlata(2000.0);
	client1.setModPlata(new PlataCard());
	client1.realizeazaPlata(205.0);
	
	client1.setModPlata(new PlataCash());
	client1.realizeazaPlata(300.0);

}
}
