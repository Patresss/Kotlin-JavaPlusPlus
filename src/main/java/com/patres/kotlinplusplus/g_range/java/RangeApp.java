package com.patres.kotlinplusplus.g_range.java;

public class RangeApp {

    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }

        for (int i = 1; i <= 5; i += 2) {
            System.out.println(i);
        }

        for (int i = 1; i < 5; i += 2) {
            System.out.println(i);
        }

        for (int i = 5; i >= 5; i--) {
            System.out.println(i);
        }
    }

}
