package Vehicles;

import Interfaces.Flyable;

import java.util.Objects;

public class Plane extends AbstractVehicle implements Flyable {


    private int height;
    private int passengersCount;

    public Plane(int height, int passCount){
        this.height=height;
        this.passengersCount=passCount;

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
    public int getHeight() {
        return height;
    }

    @Override
    public AbstractVehicle setHeight(int height) {
        this.height = height;
        return this;
    }








    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Plane plane = (Plane) o;
        return height == plane.height &&
                passengersCount == plane.passengersCount;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), height, passengersCount);
    }

    @Override
    public String toString() {
        return "Plane{" +
                "height=" + height +
                ", passengersCount=" + passengersCount +
                '}'
                +super.toString();
    }
}
