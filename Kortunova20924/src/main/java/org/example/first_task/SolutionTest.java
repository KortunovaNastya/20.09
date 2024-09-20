package org.example.first_task;


import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;



public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void testCase1() {
        int[] result = solution.searchRange(new int[]{5, 7, 7, 8, 8, 10}, 8);
        assertArrayEquals(new int[]{3, 4}, result); // или {4, 3}
    }

    @Test
    public void testCase2() {
        int[] result = solution.searchRange(new int[]{5, 7, 7, 8, 8, 10}, 6);
        assertArrayEquals(new int[]{-1, -1}, result);
    }

    @Test
    public void testCase3() {
        int[] result = solution.searchRange(new int[]{1, 2, 3, 4, 5}, 3);
        assertArrayEquals(new int[]{2, 2}, result);
    }

    @Test
    public void testCase4() {
        int[] result = solution.searchRange(new int[]{1, 1, 1, 1, 1}, 1);
        assertArrayEquals(new int[]{0, 4}, result);
    }

    @Test
    public void testCase5() {
        int[] result = solution.searchRange(new int[]{1, 2, 3, 4, 5}, 1);
        assertArrayEquals(new int[]{0, 0}, result);
    }

    @Test
    public void testCase6() {
        int[] result = solution.searchRange(new int[]{1, 2, 3, 4, 5}, 5);
        assertArrayEquals(new int[]{4, 4}, result);
    }

    @Test
    public void testCase7() {
        int[] result = solution.searchRange(new int[]{1, 2, 3, 2, 2, 4}, 2);
        assertArrayEquals(new int[]{1, 4}, result); // или {4, 1}
    }

    @Test
    public void testCase8() {
        int[] result = solution.searchRange(new int[]{}, 0);
        assertArrayEquals(new int[]{-1, -1}, result);
    }
}
