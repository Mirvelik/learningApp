package com.vadimlopatka.immutability.interval;

import java.util.ArrayList;

/**
 * Range decorator
 */
public class OddRangeArray implements Interval {

    private Interval decoratedInterval;

    public OddRangeArray(Interval interval) {
        decoratedInterval = interval;
    }

    @Override
    public int[] numbers() {
        int[] numbers = decoratedInterval.numbers();

        ArrayList<Integer> oddInts = new ArrayList<>();

        for (int i = 0; i < numbers.length; i++) {
            if ((numbers[i] % 2) != 0) {
                oddInts.add(numbers[i]);
            }
        }

        return oddInts.stream().mapToInt(i -> i).toArray();
    }
}
