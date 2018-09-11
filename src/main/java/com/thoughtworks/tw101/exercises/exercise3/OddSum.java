package com.thoughtworks.tw101.exercises.exercise3;

public class OddSum {

    // sums odd integers between start and end INCLUSIVE
    public int of(int start, int end) {
        if(end < start) { throw new IllegalArgumentException("end is greater than start"); }

        int sum = 0;

        for(int i = start; i < end+1; i++) {
            if(i % 2 == 1) {
                sum += i;
            }
        }

        return sum;
    }
}
