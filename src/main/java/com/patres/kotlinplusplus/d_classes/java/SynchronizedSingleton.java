package com.patres.kotlinplusplus.d_classes.java;

public class SynchronizedSingleton {

    private static SynchronizedSingleton instance = null;

    private SynchronizedSingleton() {
    }

    private synchronized static void createInstance() {
        if (instance == null) {
            instance = new SynchronizedSingleton();
        }
    }

    public static SynchronizedSingleton getInstance() {
        if (instance == null) {
            createInstance();
        }
        return instance;
    }

}
