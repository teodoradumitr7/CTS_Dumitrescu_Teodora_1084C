package state.clase;

public class BusAtEndOfRoute implements IBusState {
    @Override
    public void changeState(Bus bus) {
        if(bus.getState() instanceof BusInRoute || bus.getState() instanceof BusInService) {
            System.out.println("the bus " + bus.getLicensePlate() + " has reached the end of the line.");
            bus.setState(this);
        } else {
            System.out.println("The bus " + bus.getLicensePlate() + " cannot reach the end of the line.");
        }
    }
}