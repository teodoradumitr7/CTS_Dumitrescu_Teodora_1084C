package observer.clase;

import java.util.ArrayList;
import java.util.List;

public class Restaurant implements Subject{
private String nume;
	private List<Observer> listaAbonati;
	
	
	public Restaurant(String nume) {
		this.nume=nume;
		listaAbonati=new ArrayList<Observer>();
	}
	@Override
	public void adaugaObserver(Observer observer) {
		// TODO Auto-generated method stub
		listaAbonati.add(observer);
		
	}

	@Override
	public void stergeObserver(Observer observer) {
		// TODO Auto-generated method stub
		listaAbonati.remove(observer);
		
	}

	@Override
	public void notificaAbonati(String mesaj) {
		// TODO Auto-generated method stub
		for(Observer client:this.listaAbonati) {
			client.receptioneazaNotificare(mesaj);
		}
		
	}
	
	public void notificaOfertaPret() {
		notificaAbonati(this.nume+ ": Sunt reduceri la burgeri");
		
	}
	
	public void notificSchimbareMeniu() {
		notificaAbonati(this.nume+": S-a adaugat un nou tip de burgeri");
	}

}
