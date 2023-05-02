package chainOfResp.clase;

public class Client {
	private String nume;
	private String email;
	private String numarTelefon;

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNumarTelefon() {
		return numarTelefon;
	}

	public void setNumarTelefon(String numarTelefon) {
		this.numarTelefon = numarTelefon;
	}

	public Client(String nume, String email, String numarTelefon) {
		super();
		this.nume = nume;
		this.email = email;
		this.numarTelefon = numarTelefon;
	}

}
