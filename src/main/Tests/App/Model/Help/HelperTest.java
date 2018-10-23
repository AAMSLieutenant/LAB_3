package App.Model.Help;

import App.Model.Builder.Types;
import org.junit.Test;
import java.util.ArrayList;
import App.Model.Builder.VehicleBuilder;
import App.Model.Vehicles.AbstractVehicle;

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
    }

    @Test
    public void sortTwo() {
    }

    @Test
    public void interfaceSort() {
    }
}