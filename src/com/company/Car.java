package com.company;

public class Car extends Transport{

    private double volume;

    public Car(String passengerCar, double volume) {
        super(passengerCar);
        this.volume = volume;
    }

    public double getVolume() {
        return volume;
    }

    public void makeSignal(String signal){
        System.out.println(signal);
    }

    public String getInfo(){
        return  "Car: " + getPassengerCar() +
                "\nVolume: " + volume;
    }
}
