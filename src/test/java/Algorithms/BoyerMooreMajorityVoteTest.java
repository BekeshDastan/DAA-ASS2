package Algorithms;

import org.example.Main;
import org.example.Result;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BoyerMooreMajorityVoteTest {
    @Test
    public void testFixedArrays() {
        int[][] testArrays = {
                {1,2,1,2,2},
                {},
                {1,1,1,2,2,2},
                {1,1,1,2,3,4,5,6,7,8,1,1}
        };

        Integer[] expected = {2, null, null, null};

        for (int i = 0; i < testArrays.length; i++) {
            int[] arr = testArrays[i];

            if (expected[i] == null) {
                assertThrows(IllegalArgumentException.class, () -> {
                    Main.majorityElement(arr);
                }, "Expected exception for array index " + i);
            } else {
                Result result = Main.majorityElement(arr);
                assertEquals(expected[i], result.majority, "Mismatch for array index " + i);
            }
        }
    }
}
