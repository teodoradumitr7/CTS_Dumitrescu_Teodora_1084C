package chainOfResp.main;

import chainOfResp.clase.Client;
import chainOfResp.clase.NotificareEmail;
import chainOfResp.clase.NotificareManager;
import chainOfResp.clase.NotificareTelefon;
import chainOfResp.clase.Notificator;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Notificator telefon=new NotificareTelefon();
		Notificator email=new NotificareEmail();
		Notificator administrator=new NotificareManager();
		
		telefon.setSuccesor(email);
		email.setSuccesor(administrator);
		
		Client client1=new Client("Ana", "ana@gmail.com", null);
		Client client2=new Client("Ion", null, "0348455782");
		Client client3=new Client("Vasile", null, null);
		
		telefon.notificaClient(client1, "Notificare ANA");
		telefon.notificaClient(client2, "Notificare ION");
		telefon.notificaClient(client3, "Notificare VASILE");
		

	}

}
