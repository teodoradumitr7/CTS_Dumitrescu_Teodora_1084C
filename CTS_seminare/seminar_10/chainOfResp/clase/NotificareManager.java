package chainOfResp.clase;

public class NotificareManager extends Notificator {

	@Override
	public void notificaClient(Client client, String mesaj) {
		// TODO Auto-generated method stub
				System.out.println("Clientul "+client.getNume()+" nu primeste notificare deoarece nu are date");
			
		}
		
	}
