package com.codingblocks.patterns.story;

public class StoryTeller {
    public static void main(String[] args) {
        Human ravi = new Human("Ravi");
        HitMan gogo = new HitMan("Gogo");
        gogo.kill(ravi);

        System.out.println(Human.population);
    }
}
