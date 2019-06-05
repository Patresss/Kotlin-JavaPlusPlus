package com.patres.kotlinplusplus.b_variables.optional.java;

import java.util.Optional;

public class OptionalApp {

    public static void main(String[] args) {
        Person person = new Person();
        System.out.println(getCountry(person));
    }

    private static String getCountry(Person person) {
        return Optional.ofNullable(person)
                .map(Person::getAddress)
                .map(Address::getCountry)
                .orElse("UNKNOWN");
    }

    
}

