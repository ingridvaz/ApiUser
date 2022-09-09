package com.api.vehicle;

public abstract class Transport {

    void startTransport(){
        IVehicle vehicle = createVehicle();
        vehicle.startRoute();
    }
    protected abstract IVehicle createVehicle();
}
