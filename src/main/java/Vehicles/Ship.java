package Vehicles;

import Abstract.AbstractVehicle;
import Builder.Types;

public class Ship extends AbstractVehicle {



    private int passengersCount;
    private String portOfResidence;

    //     private int cost;
//    private int speed;
//    private int issueYear;
//    private int x;
//    private int y;
//    private int[] coordinates;


    public Ship(int passCount, String port){
        this.passengersCount=passCount;
        this.portOfResidence=port;
    }

}
