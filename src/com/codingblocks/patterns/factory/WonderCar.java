package com.codingblocks.patterns.factory;

public class WonderCar extends Car {


    @Override
    public void start() {
        System.out.println("Start like wonderCar");
    }

    @Override
    public void stop() {
        System.out.println("Stop like wonderCar");
    }
}
