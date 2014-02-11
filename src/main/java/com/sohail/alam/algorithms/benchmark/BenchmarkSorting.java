package com.sohail.alam.algorithms.benchmark;

import com.sohail.alam.algorithms.interfaces.Sorting;
import com.sohail.alam.algorithms.utils.Utilities;

import java.util.concurrent.TimeUnit;

/**
 * Created by sohail.alam on 11/2/14.
 */
public class BenchmarkSorting {

    private Sorting type;

    public BenchmarkSorting(Sorting type) {
        this.type = type;
    }

    public void benchmark(final int SIZE) {
        System.out.print("Generating Input... ");
        int[] input = Utilities.generateRandomIntArray(SIZE);
        System.out.print("Input Generated... ");
        long startTime = System.nanoTime();
        System.out.print(String.format("%-25s", "Sorting... N = " + SIZE)
                + String.format("%-20s", " Time Taken (millis): "));

        /*--SORT--*/
        type.sort(input);
        /*--------*/

        long stopTime = System.nanoTime();
        long timeTaken = stopTime - startTime;
        System.out.println(TimeUnit.MILLISECONDS.convert(timeTaken, TimeUnit.NANOSECONDS));
    }

}
