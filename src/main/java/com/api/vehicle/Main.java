package com.api.vehicle;

public class Main {
    private static Transport transport;

    public static void main(String[] args) {
        configure(args[0]);
        if (transport != null){
            runTransport();
        }
    }

    private static void runTransport() {
        transport.startTransport();
    }

    private static void configure(String type) {
        switch (type){
            case "uber":
                transport = new CarTransport();
                break;
            case "log":
                transport = new MotocicleTransport();
                break;
            case "eat":
                transport = new BikeTransport();
                break;
            default:
                System.out.println("Opcao invalida");
        }
    }
}
