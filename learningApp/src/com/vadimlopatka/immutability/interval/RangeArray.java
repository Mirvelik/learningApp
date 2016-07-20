package com.vadimlopatka.immutability.interval;

public class RangeArray implements Interval {
    private final int from;
    private final int to;

    public RangeArray(int from, int to) {
        this.from = from;
        this.to = to;
    }

    public int[] numbers() {
        int[] ints = new int[to - from];

        for (int i = 0; i < ints.length; i++) {
            ints[i] = i + from;
        }

        return ints;
    }
}
