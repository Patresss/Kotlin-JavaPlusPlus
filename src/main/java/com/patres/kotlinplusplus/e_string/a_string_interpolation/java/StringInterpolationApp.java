package com.patres.kotlinplusplus.e_string.a_string_interpolation.java;

public class StringInterpolationApp {

    public static void main(String[] args) {
        String name = "Tom";
        String surname = "Apple";
        String fullName = name + " " + surname;
        System.out.println("\"" + fullName + "\" has " + fullName.length() + " characters");
    }

}
