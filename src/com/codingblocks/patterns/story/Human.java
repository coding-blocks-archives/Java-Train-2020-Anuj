package com.codingblocks.patterns.story;

import java.util.ArrayList;

public class Human {

    protected String name;
    protected boolean alive;

    public static ArrayList<Human> population = new ArrayList<>();

    public Human(String name) {
        this.name = name;
        this.alive = true;
        Human.population.add(this);
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", alive=" + alive +
                '}';
    }
}
