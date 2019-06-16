package com.crpower;

public class ArrayPerson {
    public static void main(String[] args) {
        Person[] personArray = {new Person("wangan", 12), new Person("wans", 2)};
        for (Person e : personArray) {
            System.out.println(e.getAge() + " " + e.getName());
        }
    }

}
