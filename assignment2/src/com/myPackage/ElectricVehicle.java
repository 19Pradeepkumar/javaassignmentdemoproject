package com.myPackage;

import com.myPackage.Vehicle;

public abstract class ElectricVehicle implements Vehicle {

    @Override
    public void type() {
        System.out.println("Electric vehicle");
    }
}
