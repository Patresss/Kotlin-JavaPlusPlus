package com.patres.kotlinplusplus.d_classes.java;

public class Property {

    public final static String VERSION = "1.0";

    private String key = "key";
    private String value = "value";


    public String getKey() {
        return key;
    }

    public void setKey(String name) {
        this.key = name;
        printMessageAboutUpdate();
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
        printMessageAboutUpdate();
    }

    private void printMessageAboutUpdate() {
        System.out.println("Property was updated {key: " + key + ", value: " + value + "}");
    }
}
