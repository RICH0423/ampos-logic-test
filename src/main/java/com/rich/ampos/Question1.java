package com.rich.ampos;

import java.util.*;

/**
 * @author rich
 */
public class Question1 {

    public static void main(String[] args) {
        int[] input = { 1, 1, 2, 2, 3 };
        Set<Integer> result = easy1(input);
        System.out.println("Input: " + Arrays.toString(input));
        System.out.println("Output: " + result);

        System.out.println("Input: " + Arrays.toString(input));
        int spaceEfficientResult = easy1SpaceEfficient(input);
        System.out.println("Output: " + spaceEfficientResult);
    }

    /**
     * Get the on-repeating value from input array.
     *
     * @return Set<Integer>
     */
    private static Set<Integer> easy1(int [] input) {
        Set<Integer> distinctMap = new HashSet<>();

        Arrays.stream(input).forEach(number -> {
            if (distinctMap.contains(number)) {
                distinctMap.remove(number);
            } else {
                distinctMap.add(number);
            }
        });

        return distinctMap;
    }

    /**
     * Get the on-repeating value from input array, which is the more efficient of space version.
     *
     * @param input
     * @return
     */
    private static int easy1SpaceEfficient(int [] input) {
        int result = 0;
        for (int i=0; i<input.length; i++) {
            result ^= input[i];
        }

        return result;
    }

}
