package com.vadimlopatka.patterns.singleton;

public class SingletonSynchronized {
    private static SingletonSynchronized singleton;

    private SingletonSynchronized() {
    }

    public static synchronized SingletonSynchronized getInstance() {
        if (singleton == null) {
            singleton = new SingletonSynchronized();
        }
        return singleton;
    }
}
