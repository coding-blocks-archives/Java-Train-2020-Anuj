package com.codingblocks.patterns.story;

public class HitMan extends Human {

    private int kills = 0;

    public HitMan(String name) {
        super(name);
    }

    public void kill(Human human){
        if(human == this){
            System.out.println("Suicide is never a solution");
        } else if(human.alive) {
            human.alive = false;
            this.kills++;
        } else {
            System.out.println("Abbe ja be");
        }
    }

    @Override
    public String toString() {
        return "HitMan{" +
                "kills=" + kills +
                ", name='" + name + '\'' +
                ", alive=" + alive +
                '}';
    }
}
