package com.myPackage;

public class ElectricBike extends ElectricVehicle{
    private int wheelsNo=2;
    private int topSpeed=100;
    private int range=110;

    @Override
    public void TopSpeed() {
        System.out.println("topspeed is " +topSpeed);
    }

    @Override
    public void range() {
        System.out.println("range is "+range+"km");
    }

    @Override
    public void wheels() {
        System.out.println("wheels are "+wheelsNo);
    }

    @Override
    public void Power() {
        System.out.println("power of the vehicle " +220);
    }

    @Override
    public void passengerCapacity() {
        System.out.println("passenegr capacity is "+2);
    }

    @Override
    public void model() {
        System.out.println("fuel vehicle");
    }


}
