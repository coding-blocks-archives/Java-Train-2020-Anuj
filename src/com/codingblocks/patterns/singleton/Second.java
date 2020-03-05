package com.codingblocks.patterns.singleton;

public class Second {

    public void doSomething(){
        Logger.getInstance().log("Doing from other class");
    }
}
