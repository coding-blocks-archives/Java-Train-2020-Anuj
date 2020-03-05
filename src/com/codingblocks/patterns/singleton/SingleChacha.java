package com.codingblocks.patterns.singleton;

public class SingleChacha {
    private static SingleChacha instance;
    private int counter = 0;

    private SingleChacha(){

    }

    public void increment(){
        this.counter++;
    }

    public int getCounter() {
        return counter;
    }

    public static SingleChacha getInstance(){
        if(SingleChacha.instance == null){
            SingleChacha.instance = new SingleChacha();
        }

        return SingleChacha.instance;
    }

}
