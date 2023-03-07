package cts.s02.principii_clean_code.clase.reader;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import cts.s02.principii_clean_code.clase.Aplicant;
import cts.s02.principii_clean_code.clase.Elev;

public class ReaderElev extends ReaderAplicant{

	@Override
	public List<Aplicant> readAplicants(String file) throws FileNotFoundException {
		Scanner input2 = new Scanner(new File(file));
		input2.useDelimiter(",|\n");
		List<Aplicant> elevi = new ArrayList<Aplicant>();

		while (input2.hasNext()) {
			Elev elev=new Elev();
			readAplicant(input2,elev);
			elev.setClasa(input2.nextInt());
			elev.setTutore(input2.next());
			elevi.add(elev);
		}

		input2.close();
		return elevi;
	}

	/*
	 public EleviReader(String file) throws FileNotFoundException {
        super(file);
    }
    
    @Override
	public List<Aplicant> readAplicants() throws FileNotFoundException{
	super.scanner.useDelimiter(",|\n");
	List<Aplicant> elevi = new ArrayList<Aplicant>();
	while(super.scanner.hasNext()){
	Elev elev=new Elev();
	readAplicant(super.scanner,elev);
	elev.setClasa(super.scanner.nextInt());
	elev.setTutore(super.scanner.next());
	elevi.add(elev);
	
	}
	scanner.close();
	return elevi;
	}
    
	 */
}
