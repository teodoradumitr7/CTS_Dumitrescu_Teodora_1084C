package cts.s02.principii_clean_code.clase.reader;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import cts.s02.principii_clean_code.clase.Aplicant;
import cts.s02.principii_clean_code.clase.Student;

public class ReaderStudent extends ReaderAplicant {

	@Override
	public List<Aplicant> readAplicants(String file) throws FileNotFoundException {
		Scanner input = new Scanner(new File(file));
		input.useDelimiter(",|\n");
		List<Aplicant> studenti = new ArrayList<Aplicant>();

		while (input.hasNext()) {
			Student student=new Student();
			super.readAplicant(input, student);
			student.setAn_studii(input.nextInt());
            student.setFacultate(input.next());
            studenti.add(student);
		}
		input.close();
		return studenti;
	}

	/*
	  public StudentReader(String file) throws FileNotFoundException {
        super(file);
    }

    @Override
    public List<Aplicant> readAplicanti() throws FileNotFoundException {
        super.scanner.useDelimiter(",|\n");
        List<Aplicant> studenti = new ArrayList<>();

        while (super.scanner.hasNext()) {
            Student student = new Student();
            readAplicant(super.scanner, student);
            student.setAn_studii(super.scanner.nextInt());
            student.setFacultate(super.scanner.next());
            studenti.add(student);
        }
        super.scanner.close();
        return studenti;
    }
	 */
}
