package com.patres.kotlinplusplus.d_classes.java;

public class ClassesApp {

    public static void main(String[] args) {
        Person person1 = new Person("Tom", "Apple");
        Person person2 = new Person("Tom", "Apple");

        System.out.println(person1.equals(person2));
        System.out.println(person1 == person2);

        String name = person1.getName();
        String surname = person1.getSurname();
        System.out.println(name + " " + surname);

        Property property = new Property();
        property.setValue("New value");

        System.out.println(Property.VERSION);
    }
    
}
