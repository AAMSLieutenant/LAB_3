package Abstract;

import java.util.Objects;
import Builder.Types;
import org.graalvm.compiler.core.common.type.ArithmeticOpTable;

public abstract class AbstractVehicle {

    private int cost;
    private int speed;
    private int issueYear;
    private int x;
    private int y;
    private int[] coordinates;

    public AbstractVehicle(){
        coordinates=new int[2];
    }



    public int getX() {
        return x;
    }

    public AbstractVehicle setX(int x) {
        this.x = x;
        return this;
    }

    public int getY() {
        return y;
    }

    public AbstractVehicle setY(int y) {
        this.y = y;
        return this;
    }

    public int getCost(){ return this.cost;}

    public AbstractVehicle setCost(int cost){
        this.cost=cost;
        return this;
    }

    public int getSpeed(){ return this.speed;}

    public AbstractVehicle setSpeed(int speed){
        this.speed=speed;
        return this;
    }

    public int getIssueYear(){return this.issueYear;}

    public AbstractVehicle setIssueYear(int issueYear){
        this.issueYear=issueYear;
        return this;
    }

    public AbstractVehicle setCoordinates(int x, int y){
        this.coordinates[0]=x;
        this.coordinates[1]=y;
        return this;
    }

    public int[] getCoordinates(int x, int y){
        return this.coordinates;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AbstractVehicle that = (AbstractVehicle) o;
        return cost == that.cost &&
                speed == that.speed &&
                issueYear == that.issueYear &&
                x == that.x &&
                y == that.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(cost, speed, issueYear, x, y);
    }



}
