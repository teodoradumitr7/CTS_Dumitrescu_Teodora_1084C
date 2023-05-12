package state.clase;

public class BusInRoute implements IBusState {
    @Override
    public void changeState(Bus bus) {
        if(bus.getState() instanceof BusAtEndOfRoute) {
            System.out.println("The bus " + bus.getLicensePlate() + " is now in service.");
            bus.setState(this);
        } else {
            System.out.println("The bus " + bus.getLicensePlate() + " cannot reach the service.");
        }
    }
}