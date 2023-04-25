package facade.clase;

import java.util.ArrayList;
import java.util.List;

public class Ospatar {
	public List<Integer> meseDebarasate;

	public Ospatar() {
		meseDebarasate = new ArrayList<Integer>();
	}

	public boolean esteMasaDebarasata(int nrMasa) {
		return meseDebarasate.contains(nrMasa);
	}
	
	public void debaraseazaMasa(int nrMasa) {
		meseDebarasate.add(nrMasa);
	}

}
