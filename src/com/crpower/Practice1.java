package com.crpower;

public class Practice1 {
    //nine * nine
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.printf(" %d x %d = %d", i, j, i * j);
            }
            System.out.println();
        }

    }
}
