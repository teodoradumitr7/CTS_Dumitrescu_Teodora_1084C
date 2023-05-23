package acs.ase.clase;

public class MyException extends IllegalArgumentException{
	String mesaj;

	public MyException(String mesaj) {
		super();
		this.mesaj = mesaj;
	}

	public String getMesaj() {
		return mesaj;
	}

	public void setMesaj(String mesaj) {
		this.mesaj = mesaj;
	}
		
		
}
