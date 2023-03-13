package cts.s02.principii_clean_code.clase;

import java.util.Arrays;

public class Angajat extends Aplicant {
	private String ocupatie;
	private int salariu;
	private static int sumaFinantare;

	public Angajat() {
		super();

	}

	public void setOcupatie(String ocupatie) {
		this.ocupatie = ocupatie;
	}

	public void setSalariu(int salariu) {
		this.salariu = salariu;
	}

	public static int getSumaFinantare() {
		return sumaFinantare;
	}

	public static void setSumaFinantare(int sumaFinantare) {
		Angajat.sumaFinantare = sumaFinantare;
	}

	@Override
	public String toString() {
		return "Angajat: Nume=" + nume + ", Prenume=" + prenume + ", Varsta=" + varsta + ", Punctaj=" + punctajObtinut
				+ ", Nr_proiecte=" + nrProiecte + ", DenumireProiect=" + Arrays.toString(denumiriProiecte) + "Ocupatie="
				+ ocupatie + ", salariu=" + salariu;
	}

	public void afisareSumaFinantare() {
		super.afisareSumaFinantare("Angajatul", sumaFinantare);
	}

}
