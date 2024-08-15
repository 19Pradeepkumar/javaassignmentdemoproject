package com.myPackage;

import com.myPackage.Vehicle;

public class Car implements Vehicle {
    private int wheelsNo=4;
    private int topSpeed=220;
    private int range=30;

    public int getWheelsNo() {
        return wheelsNo;
    }

    public void setWheelsNo(int wheelsNo) {
        this.wheelsNo = wheelsNo;
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }

    public int getRange() {
        return range;
    }

    public void setRange(int range) {
        this.range = range;
    }

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
        System.out.println("power of the vehicle " +420);
    }

    @Override
    public void passengerCapacity() {
        System.out.println("passenegr capacity is "+4);
    }

    @Override
    public void model() {
        System.out.println("fuel vehicle");
    }

    @Override
    public void type() {
        System.out.println("petrol vehicle");
    }
}
