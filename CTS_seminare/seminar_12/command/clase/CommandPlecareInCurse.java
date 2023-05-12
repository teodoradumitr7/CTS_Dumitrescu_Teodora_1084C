package command.clase;

public class CommandPlecareInCurse implements ICommand {
	
	private int numarLinie;
    private Automobil automobil;
    
	public CommandPlecareInCurse(int numarLinie, Automobil automobil) {
		super();
		this.numarLinie = numarLinie;
		this.automobil = automobil;
	}

	@Override
	public void execute() {
		automobil.plecareInCursa(this.numarLinie);
	}

}
