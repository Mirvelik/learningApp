package com.vadimlopatka.concurrent;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/**
 * On the first day of your new job, your boss asks you to find all primes between
 * 1 and 10 in(10) (never mind why), using a parallel machine that supports ten concurrent
 * threads.
 * This machine is rented by the minute, so the longer your program
 * takes, the more it costs.
 * You want to make a good impression. What do you do?
 */
public class PrimesMain {
    public static void main(String[] args) {
        Executors.newSingleThreadExecutor();
    }
}
