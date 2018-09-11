package com.thoughtworks.tw101.exercises.exercise2;

public class Accumulator {
    int acc;

    public Accumulator() {
        acc = 0;
    }

    void increment() {
        acc++;
    }

    void total() {
        System.out.println(acc);
    }
}
