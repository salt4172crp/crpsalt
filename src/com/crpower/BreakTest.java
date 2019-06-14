package com.crpower;

public class BreakTest {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            if (0 == i % 2) {
                System.out.println(i + " the output is even number ");
            }
            if (50 == i) {
                System.out.println("the output should be less than 50");
                break;
            }
        }
    }
}
