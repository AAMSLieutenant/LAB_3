package App.Model.Interfaces;

import App.Model.Vehicles.AbstractVehicle;

public interface Swimable {

    public int getPassengersCount();
    public AbstractVehicle setPassengersCount(int passengersCount);
    public String getPortOfResidence();
    public AbstractVehicle setPortOfResidence(String portOfResidence);


}
