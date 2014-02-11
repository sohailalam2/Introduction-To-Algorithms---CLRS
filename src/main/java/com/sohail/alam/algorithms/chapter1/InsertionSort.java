package com.sohail.alam.algorithms.chapter1;

import com.sohail.alam.algorithms.interfaces.Sorting;

/**
 * Created by sohail.alam on 11/2/14.
 * <p/>
 * This class demonstrate the Insertion Sort Algorithm whose running time is
 * defined as theta-of-n-squared - O(n^2)
 */
public class InsertionSort implements Sorting {
    @Override
    public int[] sort(int[] A) {
        for (int j = 1; j < A.length; j++) {
            int key = A[j];
            int i = j - 1;
            while ((i > -1) && (A[i] > key)) {
                A[i + 1] = A[i];
                i = i - 1;
            }
            A[i + 1] = key;
        }
        return A;
    }
}
