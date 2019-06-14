package com.crpower;

public class WhileTest {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.printf("%d * %d = %d", i, j, i * j);
            }
            System.out.println();
        }
        System.out.println();
    }
}
