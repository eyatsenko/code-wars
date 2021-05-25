/*
Complete the function that takes two integers (a, b, where a < b) and return an array of all integers between the input parameters, including them.
For example:
a = 1
b = 4
--> [1, 2, 3, 4]
*/


import java.util.Arrays;
import static java.lang.Math.*;

import static java.lang.Math.abs;

public class WhatIsBetween {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(between(-90, -89)));
    }

    public static int[] between(int a, int b) {
        int [] array;
        if (a <= 0 && b >= 0) {
            int arraySize = abs(a) + abs(b);
            array = new int[arraySize +1];
            array[0] = a;
            array[arraySize] = b;
            for (int i = 1; i <= arraySize; i++) {
                array[i] = a + i;
            }
        } else if (a < 0 && b < 0) {
            int arraySize = abs(a) - abs(b);
            array = new int[arraySize + 1];
            array[0] = a;
            if (arraySize == 1) {
                array[1] = b;
            } else {
                array[arraySize - 1] = b;}
            for (int i = 1; i <= arraySize; i++) {
                array[i] = a + i;
            }
        } else {
            int arraySize = abs(b) - abs(a) +1;
            array = new int[arraySize];
            array[0] = a;
            array[arraySize - 1] = b;
            for (int i = 1; i < arraySize; i++) {
                array[i] = a + i;
            }
        }
        return array;
    }
}
