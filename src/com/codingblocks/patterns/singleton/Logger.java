package com.codingblocks.patterns.singleton;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Logger {

    private static Logger instance;
    private PrintStream out;

    private Logger(){
        File f = new File("log.txt");
        try {
            this.out = new PrintStream(f);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static Logger getInstance(){
        if(Logger.instance == null){
            Logger.instance = new Logger();
        }
        return Logger.instance;
    }

    public void log(String text){
        this.out.println(text);
    }
}
