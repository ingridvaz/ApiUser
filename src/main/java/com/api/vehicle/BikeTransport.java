package com.api.vehicle;

public class BikeTransport extends Transport{

    @Override
    protected IVehicle createVehicle() {
        return new Bike();
    }
}
