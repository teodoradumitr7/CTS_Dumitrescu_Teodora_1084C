package chainOfResp.clase;

public abstract class Notificator {
	private Notificator succesor = null;

	public abstract void notificaClient(Client client, String mesaj);

	public Notificator getSuccesor() {
		return succesor;
	}

	public void setSuccesor(Notificator succesor) {
		this.succesor = succesor;
	}

}
