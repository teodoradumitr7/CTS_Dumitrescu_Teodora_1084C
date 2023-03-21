package spital_factory_method;

public class Infirmier implements PersonalSpital {
	private String nume;
	private Integer aniVechime;
	
	public Infirmier(String nume, Integer aniVechime) {
		this.nume = nume;
		this.aniVechime=aniVechime;
	}

	public Infirmier(String nume) {
		this.nume = nume;
		this.aniVechime=0;
	}
	
	public void setAniVechime(Integer aniVechime) {
		this.aniVechime=aniVechime;
	}
	
	@Override

	public void descriere() {
		System.out.println("Infirmierul " + this.nume +" are " 
	+ this.aniVechime + " ani vechime;");

	}
}
