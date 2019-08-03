package com.rich.ampos;

import java.util.Arrays;

/**
 * @author rich
 */
public class Question2 {

    public static void main(String[] args) {
        int[] input = { 1, 2, 3, 4 };

        int[] result = moderate1(input);
        System.out.println("Input: " + Arrays.toString(input));
        System.out.println("Output: " + Arrays.toString(result));
    }

    public static int[] moderate1(int[] nums) {
        int length = nums.length;
        int[] left = new int[length];
        int[] right = new int[length];
        int[] result = new int[length];

        left[0] = 1;
        for (int i = 1; i < length; i++) {
            left[i] = nums[i - 1] * left[i - 1];
        }

        right[length - 1] = 1;
        for (int i = length - 2; i >= 0; i--) {
            right[i] = nums[i + 1] * right[i + 1];
        }

        for (int i = 0; i < length; i++) {
            result[i] = left[i] * right[i];
        }

        return result;
    }
}
