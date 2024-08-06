package practice.leetcodeEasy.arr10ay;

import java.util.Arrays;

public class Solution3 {

    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 1, 1};
        int[] res = runningSum(nums);
        System.out.println(Arrays.toString(res));
    }

    public static int[] runningSum(int[] nums) {
        int[] ans = new int[nums.length];
        if (nums.length == 0)
            return ans;
        ans[0] = nums[0];
        for (int i = 1; i <= nums.length - 1; i++) {
            ans[i] = nums[i - 1] + nums[i];
        }
        return ans;
    }
}
