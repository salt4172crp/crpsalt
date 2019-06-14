package com.crpower;

public class ContinueTest {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            if (i % 7 == 0) {
                System.out.println("被忽略的数字是： " + i);
                continue;
            }
            System.out.printf("the output  is %d \n", i);
        }
    }
}
