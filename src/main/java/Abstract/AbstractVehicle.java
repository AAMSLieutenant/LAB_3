package Abstract;

import java.util.Objects;

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

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getCost(){ return this.cost;}

    public void setCost(int cost){ this.cost=cost;}

    public int getSpeed(){ return this.speed;}

    public void setSpeed(int speed){ this.speed=speed;}

    public int getIssueYear(){return this.issueYear;}

    public void setIssueYear(int issueYear){ this.issueYear=issueYear;}

    public void setCoordinates(int x, int y){
        this.coordinates[0]=x;
        this.coordinates[1]=y;
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
