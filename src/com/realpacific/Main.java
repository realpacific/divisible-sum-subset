package com.realpacific;

import com.realpacific.generators.Generator;
import com.realpacific.generators.SubsetGenerator;
import com.realpacific.runners.DivisibleFinderRunnable;
import com.realpacific.runners.Runner;

import java.util.Arrays;

/**
 * The technique is used is:
 * - Generate all the possible subsets of given array
 * - Check if it is divisible by divisor
 */
public class Main {

    public static void main(String[] args) {
        Integer[] input = new Integer[]{4, 5, 0, -2, -3, 1};
        int divisor = 5;

        Generator<Integer> gen = new SubsetGenerator(Arrays.asList(input));

        Runner runner = new DivisibleFinderRunnable(gen);
        System.out.printf("Total number of subsets div by %d is: %d%n", divisor, runner.run(input, divisor));
    }
}
