package cts.s02.principii_clean_code.main;

import java.io.FileNotFoundException;
import java.util.List;

import cts.s02.principii_clean_code.clase.Aplicant;
import cts.s02.principii_clean_code.clase.Utils;
import cts.s02.principii_clean_code.clase.reader.ReaderAngajat;

public class Program {

	public static void main(String[] args) {
		ReaderAngajat readerAngajat=new ReaderAngajat();
		List<Aplicant> listaAngajati;
		try {
			listaAngajati = readerAngajat.readAplicants("angajati.txt");
			for(Aplicant angajat:listaAngajati)
				System.out.println(angajat.toString());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
