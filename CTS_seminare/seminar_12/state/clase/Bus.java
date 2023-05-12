package state.clase;

public class Bus {
    private IBusState state;
    private String licensePlate;

    public Bus(String licensePlate) {
        state = new BusAtEndOfRoute();
        this.licensePlate = licensePlate;
    }

    public IBusState getState() {
        return state;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    protected void setState(IBusState state) {
        this.state = state;
    }

    public void leaveForRoute() {
        IBusState route = new BusInRoute();
        route.changeState(this);
    }

    public void goInService() {
        IBusState service = new BusInService();
        service.changeState(this);
    }

    public void arriveAtTheEndOfRoute() {
        IBusState end = new BusAtEndOfRoute();
        end.changeState(this);
    }

}