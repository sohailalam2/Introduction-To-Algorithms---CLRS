package com.sohail.alam.algorithms.utils;

import java.util.Random;

/**
 * Created by sohail.alam on 11/2/14.
 */
public class Utilities {

    public static int[] generateRandomIntArray(final int SIZE) {
        int[] input = new int[SIZE];
        Random random = new Random();
        for (int i = 0; i < SIZE; i++) {
            input[i] = random.nextInt(SIZE * 100);
        }
        return input;
    }

    public static void printIntArray(int[] A, String msg) {
        System.out.println("\r\n" + msg);
        for (int a : A) System.out.print(a + "; ");
    }

}
