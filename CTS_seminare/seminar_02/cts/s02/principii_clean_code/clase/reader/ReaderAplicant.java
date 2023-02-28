package cts.s02.principii_clean_code.clase.reader;
import java.io.FileNotFoundException;
import java.util.List;

import cts.s02.principii_clean_code.clase.Aplicant;

public abstract class ReaderAplicant {
	public abstract List<Aplicant> readAplicants(String file) throws FileNotFoundException;
}
