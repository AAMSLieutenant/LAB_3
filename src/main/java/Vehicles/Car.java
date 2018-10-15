package Vehicles;

import Abstract.AbstractVehicle;
import Builder.Types;

import java.util.Objects;

public class Car extends AbstractVehicle {


//     private int cost;
//    private int speed;
//    private int issueYear;
//    private int x;
//    private int y;
//    private int[] coordinates;

    public Car(){

    }

    @Override
    public boolean equals(Object o) {
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
    public int hashCode() {
        return Objects.hash(this.getCost(), this.getSpeed(), this.getIssueYear(), this.getX(), this.getY());
    }




}
