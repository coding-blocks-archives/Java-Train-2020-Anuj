package com.codingblocks.patterns.factory;

import java.util.Scanner;

public class Client {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        String carName = s.nextLine();
        Car mycar = CarFactory.getCar(carName);
        if (mycar == null){
            System.out.println("We could not find a car for you");
        } else {
            mycar.start();
            mycar.stop();
        }
    }
}
