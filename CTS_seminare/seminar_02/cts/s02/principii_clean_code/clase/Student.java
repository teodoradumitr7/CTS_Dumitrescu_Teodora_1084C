package cts.s02.principii_clean_code.clase;

import java.util.Arrays;

public class Student extends Aplicant {
	protected String facultate;
	protected int anStudii;
	private static int sumaFinantare;

	public Student() {
		super();

	}

	public String getFacultate() {
		return facultate;
	}

	public void setFacultate(String facultate) {
		this.facultate = facultate;
	}

	public int getAn_studii() {
		return anStudii;
	}

	public void setAn_studii(int an_studii) {
		this.anStudii = an_studii;
	}

	public static int getSumaFinantare() {
		return sumaFinantare;
	}

	public static void setSumaFinantare(int sumaFinantare) {
		Student.sumaFinantare = sumaFinantare;
	}

	@Override
	public String toString() {
		return "Student: Nume=" + nume + ", Prenume=" + prenume + ", Varsta=" + varsta + ", Punctaj=" + punctajObtinut
				+ ", Nr_proiecte=" + nrProiecte + ", DenumireProiect=" + Arrays.toString(denumiriProiecte)
				+ "Facultate=" + facultate + ", An_studii=" + anStudii;
	}

	@Override
	public void afisareSumaFinantare() {
		super.afisareSumaFinantare("Student", sumaFinantare);
	}

}
