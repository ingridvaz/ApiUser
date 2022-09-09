package com.api.vehicle;

public class MotocicleTransport extends Transport{
    @Override
    protected IVehicle createVehicle() {
        return new Motocicle();
    }
}
