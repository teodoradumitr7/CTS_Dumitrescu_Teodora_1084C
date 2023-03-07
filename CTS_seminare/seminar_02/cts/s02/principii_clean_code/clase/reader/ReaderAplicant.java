package cts.s02.principii_clean_code.clase.reader;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

import cts.s02.principii_clean_code.clase.Aplicant;

public abstract class ReaderAplicant {
	public abstract List<Aplicant> readAplicants(String file) throws FileNotFoundException;


	public void readAplicant(Scanner input,Aplicant aplicant) {
		aplicant.setNume(input.next());
		aplicant.setPrenume(input.next());
        aplicant.setVarsta(input.nextInt());
        aplicant.setPunctaj(input.nextInt());

        int nrProiecte = input.nextInt();
        String[] proiecte=new String[nrProiecte];
        for(int i=0;i<nrProiecte;i++)
        	proiecte[i]=input.next();
        aplicant.setNr_proiecte(nrProiecte,proiecte);
	}
	
}
