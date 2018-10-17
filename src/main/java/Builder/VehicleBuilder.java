package Builder;

import Vehicles.AbstractVehicle;
import Vehicles.Car;
import Vehicles.Plane;
import Vehicles.Ship;


import java.util.ArrayList;
import java.util.Scanner;

public class VehicleBuilder {


    public static int cost;
    public static int speed;
    public static int issueYear;
    public static int x;
    public static int y;
    public static int[] coordinates;

    public static int height;
    public static int passCount;

    public static String port;
    public static Types Type;

    private static ArrayList<AbstractVehicle> arr;





    public static AbstractVehicle getVehicle(Types T){
        if(T.equals(Types.CAR)){
            return new Car()
                    .setCost(cost)
                    .setSpeed(speed)
                    .setIssueYear(issueYear)
                    .setX(x)
                    .setY(y)
                    .setCoordinates(x, y);
        }
        if(T.equals(Types.PLANE)){
            return new Plane(height, passCount)
                    .setCost(cost)
                    .setSpeed(speed)
                    .setIssueYear(issueYear)
                    .setX(x)
                    .setY(y)
                    .setCoordinates(x, y);
        }
        if(T.equals(Types.SHIP)){
            return new Ship(passCount, port)
                    .setCost(cost)
                    .setSpeed(speed)
                    .setIssueYear(issueYear)
                    .setX(x)
                    .setY(y)
                    .setCoordinates(x, y);
        }
        else{
            return null;
        }

    }



    public static ArrayList<AbstractVehicle> getVehicles(){
        arr=new ArrayList<AbstractVehicle>();
        arr.add(new Car()
        .setCost(2000)
        .setSpeed(300)
        .setIssueYear(2016)
        .setCoordinates(45, 67));

        arr.add(new Car()
        .setCost(2500)
        .setSpeed(210)
        .setIssueYear(2015)
        .setCoordinates(67, 43));

        arr.add(new Plane(7000, 210)
        .setCost(34000)
        .setSpeed(760)
        .setIssueYear(2003)
        .setCoordinates(120, 132));

        arr.add(new Plane(8000, 250)
                .setCost(72000)
                .setSpeed(900)
                .setIssueYear(2005)
                .setCoordinates(147, 171));

        arr.add(new Ship(400, "Port1")
                .setCost(130000)
                .setSpeed(45)
                .setIssueYear(2015)
                .setCoordinates(100, 17));

        arr.add(new Ship(600, "Port2")
                .setCost(230000)
                .setSpeed(35)
                .setIssueYear(2017)
                .setCoordinates(111, 165));

        return arr;
    }

    public static ArrayList<AbstractVehicle> getMovables(){

        arr=new ArrayList<AbstractVehicle>();
        arr.add(new Car()
                .setCost(2000)
                .setSpeed(300)
                .setIssueYear(2016)
                .setCoordinates(45, 67));

        arr.add(new Car()
                .setCost(2500)
                .setSpeed(210)
                .setIssueYear(2015)
                .setCoordinates(67, 43));

        return arr;

    }

    public static ArrayList<AbstractVehicle> getFlyables(){

        arr=new ArrayList<AbstractVehicle>();
        arr.add(new Plane(7000, 210)
                .setCost(34000)
                .setSpeed(760)
                .setIssueYear(2003)
                .setCoordinates(120, 132));

        arr.add(new Plane(8000, 250)
                .setCost(72000)
                .setSpeed(900)
                .setIssueYear(2005)
                .setCoordinates(147, 171));

        return arr;

    }

    public static ArrayList<AbstractVehicle> getSwimables(){

        arr=new ArrayList<AbstractVehicle>();
        arr.add(new Ship(400, "Port1")
                .setCost(130000)
                .setSpeed(45)
                .setIssueYear(2015)
                .setCoordinates(100, 17));

        arr.add(new Ship(600, "Port2")
                .setCost(230000)
                .setSpeed(35)
                .setIssueYear(2017)
                .setCoordinates(111, 165));

        return arr;
    }



}
