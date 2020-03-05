package com.codingblocks.patterns.factory;

public class CarFactory {

    public static Car getCar(String carName){

        switch (carName) {
            case "maruti":
                return new Maruti();
            case "audi":
                return new Audi();
            case "wonder":
                return new WonderCar();
            default:
                return null;
        }

    }
}
