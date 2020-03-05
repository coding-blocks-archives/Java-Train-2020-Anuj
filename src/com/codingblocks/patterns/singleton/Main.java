package com.codingblocks.patterns.singleton;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        File f = new File("hello.txt");

//        System.out.println(f.getAbsolutePath());

        PrintStream out = new PrintStream(f);

        out.println("Welcome to CB");
        out.println("Welcome to CB");
        out.println("Welcome to CB");
        out.println("Welcome to CB");
        out.println("Welcome to CB");
        out.println("Welcome to CB");


    }
}
