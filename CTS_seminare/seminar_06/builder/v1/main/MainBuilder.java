package builder.v1.main;

import builder.v1.Pacient;
import builder.v1.PacientBuilder;

public class MainBuilder {

	public static void main(String[] args) {
		
		PacientBuilder pacientBuilder = new PacientBuilder("Andreescu Vasile");
		Pacient pacient = pacientBuilder.setMicDejun(true).build();
		Pacient pacientNou = new PacientBuilder("Marinescu Roxana").build();
		Pacient pacientNou2 = new PacientBuilder("Ionescu Ionel").setPapuciDeCamera(true).build();
		//Pacient pacientNou3 = pacientBuilder.setNume("Ana Manole").build();
		
       System.out.println(pacient.toString());
       System.out.println(pacientNou.toString());
       System.out.println(pacientNou2.toString());
      // System.out.println(pacientNou3.toString());
       //pacient.setMicDeJunInclus(false);
	}

}