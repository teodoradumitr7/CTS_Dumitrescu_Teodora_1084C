package facade.clase;

import java.util.List;

public class FacadeRestaurant {
	private MeseRestaurant meseRestaurant;
	private Ospatar ospatar;

	public FacadeRestaurant() {
		meseRestaurant = new MeseRestaurant();
		meseRestaurant.adaugaMasa(new Masa(true, 1, true));
		meseRestaurant.adaugaMasa(new Masa(false, 2, true));
		meseRestaurant.adaugaMasa(new Masa(true, 3, false));
		meseRestaurant.adaugaMasa(new Masa(true, 4, true));
		meseRestaurant.adaugaMasa(new Masa(false, 5, false));
		ospatar = new Ospatar();
		ospatar.debaraseazaMasa(1);
		ospatar.debaraseazaMasa(3);
	}

	public String verificareDisponibilitateMasa(int nrMasa) {
		if (meseRestaurant.esteMasaLibera(nrMasa)) {
			if (ospatar.esteMasaDebarasata(nrMasa) && meseRestaurant.suntServeteleNoi(nrMasa)) {
				return "Masa este libera si puteti lua loc.";
			} else {
				return "Masa este libera asteptati sa fie debarasata.";
			}
		} else {
			return "Masa nu este libera.";
		}
	}

}
