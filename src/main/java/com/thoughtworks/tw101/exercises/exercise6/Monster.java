package com.thoughtworks.tw101.exercises.exercise6;

public interface Monster {
    // Monster takes damage by amount in parameter
    public void takeDamage(int amount);

    // Monster reports status, name + hitpoints
    public void reportStatus();

    public String getName();

    public int getHitpoints();
}
