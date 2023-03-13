package cts.s02.principii_clean_code.clase.reader;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

import cts.s02.principii_clean_code.clase.Aplicant;

public abstract class ReaderAplicant {
	public abstract List<Aplicant> readAplicants(String file) throws FileNotFoundException;


	public void readAplicant(Scanner scanner,Aplicant aplicant) {
		aplicant.setNume(scanner.next());
		aplicant.setPrenume(scanner.next());
        aplicant.setVarsta(scanner.nextInt());
        aplicant.setPunctaj(scanner.nextInt());

        int nrProiecte = scanner.nextInt();
        String[] proiecte=new String[nrProiecte];
        for(int i=0;i<nrProiecte;i++)
        	proiecte[i]=scanner.next();
        aplicant.setNr_proiecte(nrProiecte,proiecte);
	}
	
}
