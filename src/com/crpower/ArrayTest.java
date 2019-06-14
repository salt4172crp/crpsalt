package com.crpower;

public class ArrayTest {
    public static void main(String[] args) {
        int[] arrayName;
        arrayName = new int[]{1, 2, 32, 310, -29};
//        for (int e : arrayName) {
//            // foreach loop ,elementary should be initial with type
//            System.out.println(e);
//        }
        for (int i = 0; i < arrayName.length; i++) {
            System.out.println(arrayName[i]);
        }
    }

}
