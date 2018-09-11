package com.thoughtworks.tw101.exercises.exercise6;

public class Orc implements Monster {
    private String name;
    private int hitpoints;

    public Orc() {
        name = "Orc";
        hitpoints = 20;
    }

    public String getName() { return name; }

    public int getHitpoints() { return hitpoints; }

    private void setHitpoints(int newHitpoints) {
        hitpoints = newHitpoints;
    }

    public void takeDamage(int amount) {
        setHitpoints(hitpoints - amount);
    }

    public void reportStatus() {
        System.out.println("Status of: " + getName());
        System.out.println(getHitpoints() + " hitpoints left");
    }
}
