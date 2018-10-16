package Vehicles;

import Interfaces.Moveable;
import Interfaces.Swimable;
import Interfaces.Flyable;

public class BatMobile extends Vehicle implements Moveable, Flyable, Swimable {

    private int height;
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
    public int getHeight() {
        return height;
    }

    @Override
    public AbstractVehicle setHeight(int height) {
        this.height = height;
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
