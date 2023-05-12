package strategy.clase;

public class PlataCardCalatorii implements TipPlata {
    @Override
    public void plateste(double pretBilet) {
        System.out.println("Plata biletului in valoare de " + pretBilet + " a fost efectuata cu Cardul de Calatorii.");
    }
}