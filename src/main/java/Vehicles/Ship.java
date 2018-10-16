package Vehicles;

import Interfaces.Swimable;

import java.util.Objects;

public class Ship extends AbstractVehicle implements Swimable {



    private int passengersCount;
    private String portOfResidence;

    public Ship(int passCount, String port){
        this.passengersCount=passCount;
        this.portOfResidence=port;
    }

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Ship ship = (Ship) o;
        return passengersCount == ship.passengersCount &&
                Objects.equals(portOfResidence, ship.portOfResidence);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), passengersCount, portOfResidence);
    }

    @Override
    public String toString() {
        return "Ship{" +
                "passengersCount=" + passengersCount +
                ", portOfResidence='" + portOfResidence + '\'' +
                '}'
                +super.toString();
    }
}
