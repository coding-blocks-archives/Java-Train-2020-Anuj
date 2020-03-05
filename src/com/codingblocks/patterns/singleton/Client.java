package com.codingblocks.patterns.singleton;

public class Client {
    public static void main(String[] args) {
        SingleChacha s1 = SingleChacha.getInstance();

        s1.increment();
        s1.increment();
        s1.increment();

        System.out.println(s1.getCounter());


        SingleChacha s2 = SingleChacha.getInstance();

        s2.increment();
        s2.increment();
        s2.increment();

        System.out.println(s2.getCounter());
    }
}
