package Builder;

import Vehicles.AbstractVehicle;
import Vehicles.Car;
import Vehicles.Plane;
import Vehicles.Ship;


import java.util.ArrayList;
import java.util.Scanner;

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

    private static ArrayList<AbstractVehicle> arr;



    public static boolean isNumber(String s){
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }

    }

    public static void dataInput(){
        Scanner sc=new Scanner(System.in);
        String choice;
        int vehicleType;
        while(true){
            System.out.print("Choose the vehicle type (1-Car, 2-Plane, 3-Ship: ");
            choice=sc.next();
            if(isNumber(choice)){
                vehicleType=Integer.parseInt(choice);
                break;
            }
        }


    }

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
