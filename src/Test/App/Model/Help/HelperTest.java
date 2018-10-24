package App.Model.Help;

import App.Model.Builder.Types;
import App.Model.Builder.VehicleBuilder;
import App.Model.Vehicles.AbstractVehicle;
import App.Model.Vehicles.Plane;
import App.Model.Vehicles.Ship;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class HelperTest {

    @Test
    public void sortOne() {
        ArrayList<AbstractVehicle> arr=new ArrayList<>();
        arr.add(VehicleBuilder.getVehicle(Types.CAR)
                .setCost(2000)
                .setSpeed(300)
                .setIssueYear(2016)
                .setCoordinates(45,67)
                );
                arr.add(VehicleBuilder.getVehicle(Types.CAR)
                .setCost(2500)
                .setSpeed(210)
                .setIssueYear(2015)
                .setCoordinates(67,43)
                );
                assertEquals(arr,Helper.sortOne(VehicleBuilder.getVehicles()));
    }

    @Test
    public void sortThree() {
        ArrayList<AbstractVehicle> arr=new ArrayList<>();
        arr.add(VehicleBuilder.getVehicle(Types.CAR)
                .setCost(2000)
                .setSpeed(300)
                .setIssueYear(2016)
                .setCoordinates(45,67)
        );
        arr.add(VehicleBuilder.getVehicle(Types.CAR)
                .setCost(2500)
                .setSpeed(210)
                .setIssueYear(2015)
                .setCoordinates(67,43)
        );
        assertEquals(arr,Helper.sortThree(VehicleBuilder.getVehicles()));
    }

    @Test
    public void sortTwo() {
        ArrayList<AbstractVehicle> arr=new ArrayList<>();
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

        assertEquals(arr,Helper.sortTwo(VehicleBuilder.getVehicles()));
    }

    @Test
    public void interfaceSort() {
        ArrayList<AbstractVehicle> arr=new ArrayList<>();
        arr.add(VehicleBuilder.getVehicle(Types.CAR)
                .setCost(2000)
                .setSpeed(300)
                .setIssueYear(2016)
                .setCoordinates(45,67)
        );

        assertEquals(arr,Helper.interfaceSort(VehicleBuilder.getMovables()));

        arr=new ArrayList<>();
        arr.add(new Plane(8000, 250)
                .setCost(72000)
                .setSpeed(900)
                .setIssueYear(2005)
                .setCoordinates(147, 171));

        assertEquals(arr,Helper.interfaceSort(VehicleBuilder.getFlyables()));



        arr=new ArrayList<>();
        arr.add(new Ship(400, "Port1")
                .setCost(130000)
                .setSpeed(45)
                .setIssueYear(2015)
                .setCoordinates(100, 17));
        assertEquals(arr,Helper.interfaceSort(VehicleBuilder.getSwimables()));
    }
}