import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class TwoSumTest {

    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1};
    }

    @Test
    public void testCase1() {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = twoSum(nums, target);
        assertArrayEquals(new int[]{0, 1}, result);
    }

    @Test
    public void testCase2() {
        int[] nums = {3, 2, 4};
        int target = 6;
        int[] result = twoSum(nums, target);
        assertArrayEquals(new int[]{1, 2}, result);
    }

    @Test
    public void testCase3() {
        int[] nums = {3, 3};
        int target = 6;
        int[] result = twoSum(nums, target);
        assertArrayEquals(new int[]{0, 1}, result);
    }

    @Test
    public void testCase4() {
        int[] nums = {1, 5, 3, 2};
        int target = 6;
        int[] result = twoSum(nums, target);
        assertArrayEquals(new int[]{1, 3}, result);
    }

    @Test
    public void testCase5() {
        int[] nums = {0, 4, 3, 0};
        int target = 0;
        int[] result = twoSum(nums, target);
        assertArrayEquals(new int[]{0, 3}, result);
    }

    @Test
    public void testCase6() {
        int[] nums = {1, 2, 3};
        int target = 7;
        int[] result = twoSum(nums, target);
        assertArrayEquals(new int[]{-1, -1}, result);
    }
}
