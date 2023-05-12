package state.clase;

public class BusInService implements IBusState {
    @Override
    public void changeState(Bus bus) {
        if(bus.getState() instanceof BusAtEndOfRoute) {
            System.out.println("The bus " + bus.getLicensePlate() + " has left in a new route.");
            bus.setState(this);
        } else {
            System.out.println("The bus " + bus.getLicensePlate() + " cannot reach the end of the line.");
        }
    }
}