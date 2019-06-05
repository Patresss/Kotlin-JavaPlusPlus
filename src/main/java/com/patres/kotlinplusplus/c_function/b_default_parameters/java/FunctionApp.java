package com.patres.kotlinplusplus.c_function.b_default_parameters.java;

import com.patres.kotlinplusplus.d_classes.java.Person;

public class FunctionApp {

    public static void main(String[] args) {
        saveUser(new Person("Tom", "Apple"));
    }

    public static void saveUser(Person user) {
        saveUser(user, false);
    }

    public static void saveUser(Person user, boolean notify) {
        if (notify) {
            sendNotification();
        }
        saveToDatabase(user);
    }

    public static void sendNotification() {}
    public static void saveToDatabase(Person user) {}
    
}
