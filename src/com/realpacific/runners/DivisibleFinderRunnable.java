package com.realpacific.runners;

import com.realpacific.generators.Generator;

import java.util.List;

import static com.realpacific.utils.Utils.decorator;

public class DivisibleFinderRunnable implements Runner {
    private Generator<Integer> generator;

    public DivisibleFinderRunnable(Generator<Integer> generator) {
        this.generator = generator;
    }

    @Override
    public Integer run(Integer[] a, int divisor) {
        int result = 0;
        List<List<Integer>> subsets = generator.generate();
        System.out.println("Subsets are: " + subsets);
        decorator();
        System.out.printf("Sum of these subset's elements is divisible by %d:%n", divisor);
        for (List<Integer> subset : subsets) {
            if (subset.isEmpty()) continue;
            int sum = sumOfElements(subset);
            if (sum % divisor == 0) {
                System.out.println(subset);
                result++;
            }
        }
        return result;
    }

    /**
     * Calculates the sum of elements in the list
     *
     * @param list input list
     * @return the sum
     */
    private Integer sumOfElements(List<Integer> list) {
        int sum = 0;
        for (Integer i : list)
            sum += i;
        return sum;
    }
}
