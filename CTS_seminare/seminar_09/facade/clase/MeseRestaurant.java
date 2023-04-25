package facade.clase;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MeseRestaurant {
	private Map<Integer, Masa> listaMese;

	public MeseRestaurant() {
		listaMese = new HashMap<Integer, Masa>();
	}

	public void adaugaMasa(Masa masa) {
		listaMese.put(masa.getNrMasa(), masa);
	}

	public boolean esteMasaLibera(int nrMasa) {
		return listaMese.get(nrMasa).isMasaLibera();

	}

	public boolean suntServeteleNoi(int nrMasa) {
		return listaMese.get(nrMasa).isAreServetele();
	}
}
