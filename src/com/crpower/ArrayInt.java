package com.crpower;

import java.util.Arrays;

public class ArrayInt {
    public static void main(String[] args) {
        int[] arrInt;
        arrInt = new int[]{1, 2, 3, 43, 10};
        int[] arrInt2 = new int[]{1, 2, 3, 4, 5};
        System.out.println("two arrays is equal :" + Arrays.equals(arrInt, arrInt2));
        System.out.println("to string first  arrays :" + Arrays.toString(arrInt));
        System.out.println("to string  second arrays :" + Arrays.toString(arrInt2));
        Arrays.fill(arrInt, 1, 3, 34);   //开始index，结束index，插入value
        System.out.println("to string first  arrays :" + Arrays.toString(arrInt));
        Arrays.sort(arrInt);
        for (int i : arrInt) {
            System.out.println(i);
        }
        System.out.println("sorted array " + Arrays.toString(arrInt));
        System.out.println(Arrays.binarySearch(arrInt, 3, 4, 34));
        System.out.println(Arrays.hashCode(arrInt));
        System.out.println(Arrays.stream(arrInt));
    }
}
