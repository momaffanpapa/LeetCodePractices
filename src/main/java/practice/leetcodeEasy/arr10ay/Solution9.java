package practice.leetcodeEasy.arr10ay;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution9 {

    public static int[] createTargetArray(int[] nums, int[] index) {
        int[] target = new int[nums.length];
        ArrayList<Integer> rb = new ArrayList<Integer>();
        for (int i = 0; i < nums.length; i++) {
            rb.add(index[i], nums[i]);
        }
        for (int i = 0; i < nums.length; i++) {
            target[i] = rb.get(i);
        }
        System.gc();
        return target;
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 2, 3, 4}, index = {0, 1, 2, 2, 1};
        int[] res = createTargetArray(nums, index);
        System.out.println(Arrays.toString(res));

    }
}
