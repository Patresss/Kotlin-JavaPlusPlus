package com.patres.kotlinplusplus.d_classes.java;

public class Singleton {

    private static Singleton instance;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }

        return instance;
    }
}

//Because enum requires more memory and in many java applications memory is crucial thing. Specially h_when you are developing for mobile applications for android.