package com.vadimlopatka.immutability;


import com.vadimlopatka.immutability.interval.OddRangeArray;
import com.vadimlopatka.immutability.interval.RangeArray;

public class Main {
    public static void main(String[] args) {
        RangeArray range = new RangeArray(4, 15);
        int[] rangeArray = range.numbers();

        print(rangeArray);


        OddRangeArray oddRange = new OddRangeArray(range);
        int[] oddArray = oddRange.numbers();

        print(oddArray);
    }

    private static void print(int[] numbers) {
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
    }
}
