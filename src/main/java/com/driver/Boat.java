package com.driver;

public class Boat implements WaterVehicle{
    private String name;

    public Boat(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    private int capacity;


    @Override
    public String getVehicleName() {
        return null;
    }

    @Override
    public int getVehicleCapacity() {
        return 0;
    }
}
