package strategy.clase;

public class Client {
private String numeClient;
private ModPlata modPlata;

public Client(String nume) {
	this.numeClient=nume;
	modPlata=new PlataCash();
}

public String getNumeClient() {
	return numeClient;
}

public void setNumeClient(String numeClient) {
	this.numeClient = numeClient;
}

public ModPlata getModPlata() {
	return modPlata;
}

public void setModPlata(ModPlata modPlata) {
	this.modPlata = modPlata;
}

public void realizeazaPlata(Double sumaPlata) {
	modPlata.plateste(numeClient, sumaPlata);
}
}
