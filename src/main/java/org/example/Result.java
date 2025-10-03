package org.example;

public class Result {
    public final int majority;
    public final int comparisons;
    public final int arrayAccesses;

    public Result(int majority, int comparisons, int arrayAccesses) {
        this.majority = majority;
        this.comparisons = comparisons;
        this.arrayAccesses = arrayAccesses;
    }
}