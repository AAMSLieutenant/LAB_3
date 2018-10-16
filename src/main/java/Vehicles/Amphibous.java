package Vehicles;

import Interfaces.Moveable;
import Interfaces.Swimable;

public class Amphibous extends Vehicle implements Moveable, Swimable {
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
