package App.Model.Vehicles;

import App.Model.Interfaces.Moveable;
import App.Model.Interfaces.Swimable;

public class Amphibous extends AbstractVehicle implements Moveable, Swimable {
    private int passengersCount;
    private String portOfResidence;



    @Override
    public int getPassengersCount() {
        return passengersCount;
    }

    @Override
    public AbstractVehicle setPassengersCount(int passengersCount) {
        this.passengersCount = passengersCount;
        return this;
    }

    @Override
    public String getPortOfResidence() {
        return portOfResidence;
    }

    @Override
    public AbstractVehicle setPortOfResidence(String portOfResidence) {
        this.portOfResidence = portOfResidence;
        return this;
    }


}
