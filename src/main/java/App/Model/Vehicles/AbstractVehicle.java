package App.Model.Vehicles;



import java.util.Arrays;
import java.util.Objects;
import java.util.Comparator;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;



public abstract class AbstractVehicle implements Comparable<AbstractVehicle> {

//    private static Logger loggger=LoggerFactory.getLogger(AbstractVehicle.class);
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
        this.x=x;
        this.y=y;
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

    @Override
    public String toString() {
        return "AbstractVehicle{" +
                "cost=" + cost +
                ", speed=" + speed +
                ", issueYear=" + issueYear +
                ", x=" + x +
                ", y=" + y +
                ", coordinates=" + Arrays.toString(coordinates) +
                "}";
    }


    @Override
    public int compareTo (AbstractVehicle o1){
        return this.getCost()-o1.getCost();
    }

    public static class Comparators{
        public static Comparator<AbstractVehicle> COST = new Comparator<AbstractVehicle>() {
            @Override
            public int compare(AbstractVehicle o1, AbstractVehicle o2) {
                return o2.getCost()-o1.getCost();
            }
        };
        public static Comparator<AbstractVehicle> SPEED = new Comparator<AbstractVehicle>() {
            @Override
            public int compare(AbstractVehicle o1, AbstractVehicle o2) {
                return o2.getSpeed() - o1.getSpeed();
            }
        };

    }

}
