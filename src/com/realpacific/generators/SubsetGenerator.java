package com.realpacific.generators;

import java.util.ArrayList;
import java.util.List;

public class SubsetGenerator implements Generator<Integer> {
    private List<Integer> integers;

    public SubsetGenerator(List<Integer> integers) {
        this.integers = integers;
    }

    @Override
    public List<List<Integer>> generate() {
        List<List<Integer>> result = new ArrayList<>();
        generateSubsets(result, 0);
        return result;
    }

    /**
     * Generates all the subsets
     * @param output Where the result of subset will be stored
     * @param depth  The depth of subset
     */
    private void generateSubsets(List<List<Integer>> output, Integer depth) {
        if (depth == integers.size() + 1) return;
        if (depth == 0) {
            output.add(new ArrayList<>());
        } else {
            ArrayList<ArrayList<Integer>> cloned = (ArrayList<ArrayList<Integer>>) ((ArrayList<List<Integer>>) output).clone();
            for (ArrayList<Integer> c : cloned) {
                ArrayList<Integer> list = (ArrayList<Integer>) c.clone();
                list.add(integers.get(depth - 1));
                output.add(list);
            }
        }
        generateSubsets(output, depth + 1);
    }
}
