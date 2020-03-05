package com.codingblocks.patterns.factory;

public class Maruti extends Car {

    @Override
    public void start() {
        System.out.println("Start like Maruti");
    }

    @Override
    public void stop() {
        System.out.println("Stop like Maruti");
    }
}
