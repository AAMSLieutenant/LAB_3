package App.Model.Vehicles;

import App.Model.Interfaces.Flyable;

import java.util.Comparator;
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
                ", passengersCount=" + passengersCount+
                super.toString()+
                "}\n";

    }

    public static class Comparators{
        public static Comparator<AbstractVehicle> HEIGHT = new Comparator<AbstractVehicle>() {
            @Override
            public int compare(AbstractVehicle o1, AbstractVehicle o2) {
                return ((Plane)o2).getHeight()-((Plane)o1).getHeight();
            }
        };
        public static Comparator<AbstractVehicle> PASSENGERSCOUNT = new Comparator<AbstractVehicle>() {
            @Override
            public int compare(AbstractVehicle o1, AbstractVehicle o2) {
                return ((Plane)o2).getPassengersCount() - ((Plane)o1).getPassengersCount();
            }
        };
    }
}
