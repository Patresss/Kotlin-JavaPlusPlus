package com.patres.kotlinplusplus.i_stream.java;

import java.util.Arrays;
import java.util.stream.Collectors;

public class App {

    public static void main(String[] args) {

        final var list = Arrays.asList(1, 2, 3, 4, 5, 7);
        final var evenNumber = list.stream()
                .filter(number -> number % 2 == 0)
                .collect(Collectors.toList());

    }

}
