package com.api.vehicle;

public class CarTransport extends Transport{
    @Override
    protected IVehicle createVehicle() {
        return new Car();
    }
}
