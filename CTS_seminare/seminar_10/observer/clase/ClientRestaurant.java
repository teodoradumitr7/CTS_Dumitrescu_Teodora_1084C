package observer.clase;

import javax.swing.event.CaretListener;

public class ClientRestaurant implements Observer {

	private String nume;
	
	public ClientRestaurant(String nume) {
		this.nume=nume;
	}
	
	
	
	@Override
	public void receptioneazaNotificare(String mesaj) {
		// TODO Auto-generated method stub
		System.out.println("Clientul "+this.nume+" a primit mesajul "+mesaj);
		
	}

}
