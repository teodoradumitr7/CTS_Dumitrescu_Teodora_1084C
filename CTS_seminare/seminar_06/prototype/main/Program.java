package prototype.main;

import java.util.HashMap;
import java.util.Map;

import prototype.IReteta;
import prototype.Reteta;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Float> solutii=new HashMap<String, Float>();
		solutii.put("sol1", (float) 1);
		solutii.put("sol2", (float) 2);
		solutii.put("sol3", (float) 3);
		
		IReteta prototype=new Reteta("Reteta1", solutii,(float)6 );
		Reteta farmacie=(Reteta) prototype.copiaza();
		farmacie.setNume("RetetaFarmacie");
		System.out.println(farmacie.toString());
		
		Reteta laborator=(Reteta) prototype.copiaza();
		laborator.setNume("RetetaLaborator");
		System.out.println(laborator.toString());
		

	}

}
