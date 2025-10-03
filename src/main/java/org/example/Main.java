package org.example;

public class Main {

    public static void main(String[] args) {
        int[] nums = {1,1,1,2,1,2,1,2};

        Result result = majorityElement(nums);
        System.out.println("Majority element: " + result.majority);
        System.out.println("Comparisons: " + result.comparisons);
        System.out.println("Array accesses: " + result.arrayAccesses);
    }

    public static Result majorityElement(int[] nums) {
        int count = 0;
        int candidate = 0;

        int comparisons = 0;
        int arrayAccesses = 0;

        for (int num : nums) {
            arrayAccesses++;
            if (count == 0) {
                candidate = num;
                count++;
                comparisons++;
            } else if (num == candidate) {
                count++;
                comparisons++;
            } else {
                comparisons++;
                count--;
            }
        }

        count = 0;
        for (int num : nums) {
            arrayAccesses++;
            if (candidate == num) {
                count++;
                comparisons++;
            }
        }

        comparisons++;
        if (count > nums.length / 2) {
            return new Result(candidate, comparisons, arrayAccesses);
        } else {
            throw new IllegalArgumentException("No majority element found");
        }
    }
}
