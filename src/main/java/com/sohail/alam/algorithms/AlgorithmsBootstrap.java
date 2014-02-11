package com.sohail.alam.algorithms;

import com.sohail.alam.algorithms.benchmark.BenchmarkSorting;
import com.sohail.alam.algorithms.chapter1.InsertionSort;
import com.sohail.alam.algorithms.interfaces.Sorting;
import com.sohail.alam.algorithms.utils.Utilities;

/**
 * Created by sohail.alam on 11/2/14.
 */
public class AlgorithmsBootstrap {

    public static void main(String[] args) {

        runSanity();

        runBenchmark();
    }

    private static void runSanity() {
        doSortingSanity(new InsertionSort());
    }

    private static void runBenchmark() {
        // Sort using Insertion-Sort Algorithm
        startSortingBenchmark(new InsertionSort());
    }

    private static void doSortingSanity(Sorting type) {
        System.out.println("Running Sanity for Sorting using : " + type.getClass().getSimpleName());
        int[] input = Utilities.generateRandomIntArray(10);
        Utilities.printIntArray(input, "Before Sorting");
        type.sort(input);
        Utilities.printIntArray(input, "After Sorting");
        System.out.println("\r\n---------------------------------------------------------------------------");
    }

    private static void startSortingBenchmark(Sorting type) {
        System.out.println("Starting Sorting Benchmark using : " + type.getClass().getSimpleName());
        BenchmarkSorting sorting = new BenchmarkSorting(type);
        sorting.benchmark(100);
        sorting.benchmark(1000);
        sorting.benchmark(10000);
        sorting.benchmark(100000);
        sorting.benchmark(1000000);
    }
}
