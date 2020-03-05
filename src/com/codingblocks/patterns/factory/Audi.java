package com.codingblocks.patterns.factory;

public class Audi extends Car {
    @Override
    public void start() {
        System.out.println("Start like Audi");
    }

    @Override
    public void stop() {
        System.out.println("Stop like Audi");
    }
}
