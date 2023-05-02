package chainOfResp.clase;

public class NotificareEmail extends Notificator {

	@Override
	public void notificaClient(Client client, String mesaj) {
		// TODO Auto-generated method stub
		if(client.getEmail()!=null) {
			System.out.println("Clientul "+client.getNume()+" primeste email cu mesajul "+mesaj);
		}
		else {
			if(super.getSuccesor()!=null)
			{super.getSuccesor().notificaClient(client, mesaj);}
			else {
				System.out.println("Clientul "+client.getNume()+" nu poate sa fie notificat");
			}
		}
		
	}
}