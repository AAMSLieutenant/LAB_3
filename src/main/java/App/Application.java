package App;

import Vehicles.AbstractVehicle;
import Builder.VehicleBuilder;
import Help.Helper;
import Vehicles.Plane;
import Vehicles.Vehicle;


import java.util.ArrayList;

public class Application {
    public static void main(String[] args) {

        ArrayList<AbstractVehicle> arr= VehicleBuilder.getVehicles();
        for(AbstractVehicle ab : arr){
            System.out.println(ab);

        }
        arr=Helper.sortTwo(arr);
        System.out.println("ARR"+arr);
    }
}
