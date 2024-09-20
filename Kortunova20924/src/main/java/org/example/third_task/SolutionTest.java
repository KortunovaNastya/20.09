package org.example.third_task;

import static junit.framework.TestCase.assertEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    public void testCase1() {
        int result = solution.lengthOfLongestSubstring("abcabcbb");
        assertEquals(3, result);
    }

    @Test
    public void testCase2() {
        int result = solution.lengthOfLongestSubstring("bbbbb");
        assertEquals(1, result);
    }

    @Test
    public void testCase3() {
        int result = solution.lengthOfLongestSubstring("pwwkew");
        assertEquals(3, result);
    }

    @Test
    public void testCase4() {
        int result = solution.lengthOfLongestSubstring("dvdf");
        assertEquals(3, result);
    }

    @Test
    public void testCase5() {
        int result = solution.lengthOfLongestSubstring("anviaj");
        assertEquals(5, result);
    }

    @Test
    public void testCase6() {
        int result = solution.lengthOfLongestSubstring(""); // Пустая строка
        assertEquals(0, result);
    }

    @Test
    public void testCase7() {
        int result = solution.lengthOfLongestSubstring(" "); // Строка с одним пробелом
        assertEquals(1, result);
    }

    @Test
    public void testCase8() {
        int result = solution.lengthOfLongestSubstring("abcdefghijklmno"); // Все разные символы
        assertEquals(15, result);
    }
}
