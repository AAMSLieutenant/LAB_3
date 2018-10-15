package Builder;

import Abstract.AbstractVehicle;
import Vehicles.Car;
import Vehicles.Plane;
import Vehicles.Ship;

public class VehicleBuilder {


    private static int cost;
    private static int speed;
    private static int issueYear;
    private static int x;
    private static int y;
    private static int[] coordinates;

    private static int height;
    private static int passCount;

    private static String port;

    public static AbstractVehicle getVehicle(Types T){
        if(T.equals(Types.CAR)){
            return new Car()
                    .setCost(cost)
                    .setSpeed(speed)
                    .setIssueYear(issueYear)
                    .setCoordinates(x, y);
        }
        if(T.equals(Types.PLANE)){
            return new Plane(height, passCount)
                    .setCost(cost)
                    .setSpeed(speed)
                    .setIssueYear(issueYear)
                    .setCoordinates(x, y);
        }
        if(T.equals(Types.SHIP)){
            return new Ship(passCount, port)
                    .setCost(cost)
                    .setSpeed(speed)
                    .setIssueYear(issueYear)
                    .setCoordinates(x, y);
        }
        else{
            return null;
        }
    }




}
