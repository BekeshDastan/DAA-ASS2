package org.example;

import java.util.Random;
import java.io.FileWriter;
import java.io.IOException;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;

public class BenchmarkRunner {
    public static void main(){
        int[] sizes = {10,100,1000,10000,100000};
        Random ran = new Random();

        try (FileWriter out = new FileWriter("results.csv");
             CSVPrinter printer = new CSVPrinter(out, CSVFormat.DEFAULT.withHeader("n", "majority", "time_ns","comparisons","Array Accesses"))) {

            for(int n : sizes){
                int[] arr = new int[n];
                for (int i = 0; i < n/2 + 1; i++) {
                    arr[i] = 1;
                }
                for (int i = n/2 + 1; i < n; i++) {
                    arr[i] = ran.nextInt(2);
                }

                long start= System.nanoTime();
                Result result = Main.majorityElement(arr);
                long end = System.nanoTime();

                long time = end - start;

                System.out.println("n=" + n + ", majority=" + result.majority + "comparisons = " + result.comparisons + "Array Accesses = " + result.arrayAccesses  +"time = "+ time + "ns");

                printer.printRecord(n, result.majority, time, result.comparisons, result.arrayAccesses);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
