package com.pluralsight;

import java.util.ArrayList;

public class Dealership {

    private ArrayList<Vehicle> carOptions = new ArrayList<>();

    public void addVehicle(Vehicle vehicleInput){

        carOptions.add(vehicleInput);
    }

    public ArrayList<Vehicle> getAllVehicles(){
        return carOptions;
    }

}
