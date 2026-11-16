//import java.math.BigDecimal;

package com.pluralsight;


public class Vehicle {
    private String carVin;
    private int carYear;
    private String carMake;
    private String carModel;
    private  String carColor;
    private int carOdometerReading;
    private double carPrice;

    public Vehicle(String carVin,int carYear,String carMake,String carModel,
    String carColor,int carOdometerReading,double carPrice){
        this.carVin = carVin;
        this.carYear = carYear;
        this.carMake = carMake;
        this.carModel = carModel;
        this.carColor = carColor;
        this.carOdometerReading = carOdometerReading;
        this.carPrice = carPrice;
    }

    public String getCarVin() {
        return carVin;
    }

    public void setCarVin(String carVin) {
        this.carVin = carVin;
    }

    public int getCarYear() {
        return carYear;
    }

    public void setCarYear(int carYear) {
        this.carYear = carYear;
    }

    public String getCarMake() {
        return carMake;
    }

    public void setCarMake(String carMake) {
        this.carMake = carMake;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public String getCarColor() {
        return carColor;
    }

    public void setCarColor(String carColor) {
        this.carColor = carColor;
    }

    public int getCarOdometerReading() {
        return carOdometerReading;
    }

    public void setCarOdometerReading(int carOdometerReading) {
        this.carOdometerReading = carOdometerReading;
    }

    public double getCarPrice() {
        return carPrice;
    }

    public void setCarPrice(double carPrice) {
        this.carPrice = carPrice;
    }
}
