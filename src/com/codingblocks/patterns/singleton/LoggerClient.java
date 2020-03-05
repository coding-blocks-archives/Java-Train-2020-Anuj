package com.codingblocks.patterns.singleton;

public class LoggerClient {
    public static void main(String[] args) {
        System.out.println("Wow...");

        Logger.getInstance().log("I have said wowwwww");

        Second ss = new Second();
        ss.doSomething();
    }
}
