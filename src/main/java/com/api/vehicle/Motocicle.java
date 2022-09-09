package com.api.vehicle;

public class Motocicle implements  IVehicle{
    @Override
    public void startRoute() {
        getCargo();
        System.out.println("Iniciando a entrega");
    }

    @Override
    public void getCargo() {
        System.out.println("Pegando a carga");
    }
}
