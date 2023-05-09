package memento.clase;

import java.util.ArrayList;
import java.util.List;

public class OperatorAutobuz {
	private List<AutobuzMemento> listaMemento;

	public OperatorAutobuz() {
		listaMemento = new ArrayList<AutobuzMemento>();
	}
	
	public void adaugaMemento(AutobuzMemento memento) {
		this.listaMemento.add(memento);
	}
	
	public AutobuzMemento getMemento(Integer pozitie) {
		return this.listaMemento.get(pozitie);
	}
}
