package App.Model.Vehicles;

import App.Model.Interfaces.Moveable;

import java.util.Comparator;
import java.util.Objects;

public class Car extends AbstractVehicle implements Moveable {

    public Car(){
    }

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AbstractVehicle that = (AbstractVehicle) o;
        return this.getCost() == that.getCost() &&
                this.getSpeed() == that.getSpeed() &&
                this.getIssueYear() == that.getIssueYear() &&
                this.getX() == that.getX() &&
                this.getY() == that.getY();
    }

    @Override
    public int hashCode(){
        return Objects.hash(this.getCost(), this.getSpeed(), this.getIssueYear(), this.getX(), this.getY());
    }

    @Override
    public String toString(){
        return "Car{"+super.toString()+"}\n";
    }




}
