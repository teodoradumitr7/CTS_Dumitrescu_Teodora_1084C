package acs.ase.clase;

public interface IPachetTuristic {
    Double getPret();
    IPersoana getClient();
    String getDestinatie();
    boolean poateRezerva();
    void aplicaDiscountVarstnici(int procent);
    void setClient(IPersoana client);
    void setPret(Double pret);

    void setDestinatie(String dest);



}
