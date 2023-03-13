package cts.s02.principii_clean_code.clase;

import java.util.Arrays;

public class Elev extends Aplicant {
	private int clasa;
	private String tutore;
	private static int sumaFinantare;

	public Elev() {
		super();
	}

	public void setClasa(int i) {
		this.clasa = i;
	}

	public void setTutore(String tutore) {
		this.tutore = tutore;
	}

	public static int getSumaFinantare() {
		return sumaFinantare;
	}

	public static void setSumaFinantare(int sumaFinantare) {
		Elev.sumaFinantare = sumaFinantare;
	}

	@Override
	public String toString() {
		return "Elev: Nume=" + nume + ", Prenume=" + prenume + ", Varsta=" + varsta + ", Punctaj=" + punctajObtinut
				+ ", Nr_proiecte=" + nrProiecte + ", DenumireProiect=" + Arrays.toString(denumiriProiecte) + "Clasa="
				+ clasa + ", Tutore=" + tutore;
	}

	@Override
	public void afisareSumaFinantare() {
		super.afisareSumaFinantare("Elev", sumaFinantare);
	}

}
