package com.patres.kotlinplusplus.b_variables.declaration.java;

public class VariablesApp {

    public final double PI = 3.14;
    public final double CALUCLATED_PI = calculatePi();

    public void type() {
        String stringValue = "Value";
        final String STRING_CONSTANT = "Const value";

        var value = "Value";
        final var CONSTANT = "Const value";
    }

    private double calculatePi() {
        return 3.14;
    }

}
