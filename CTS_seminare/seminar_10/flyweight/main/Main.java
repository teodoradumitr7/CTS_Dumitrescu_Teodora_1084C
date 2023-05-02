package flyweight.main;

import flyweight.clase.FabricaClienti;
import flyweight.clase.IClient;
import flyweight.clase.Rezervare;

public class Main {
public static void main(String[] args) {
	FabricaClienti fabrica = new FabricaClienti();
    Rezervare rezervare1 = new Rezervare(1, 1, 2, 16);
    Rezervare rezervare2 = new Rezervare(2, 2, 4, 14);
    Rezervare rezervare3 = new Rezervare(3, 1, 2, 18);
    Rezervare rezervare4 = new Rezervare(4, 3, 1, 12);

    IClient client1 = fabrica.getClient("Maria");
    client1.descriereDetaliiRezervare(rezervare1);

    IClient client2 = fabrica.getClient("Ion");
    client2.descriereDetaliiRezervare(rezervare2);

    fabrica.getClient("Maria").descriereDetaliiRezervare(rezervare3);
    fabrica.getClient("Ion").descriereDetaliiRezervare(rezervare4);

}
}
