package practice.leetcodeEasy.array;

import java.util.Arrays;

public class Solution2 {

    /*public static int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[nums[i]];
        }
        return ans;
    }*/

    public static void main(String[] args) {
        int[] arr = {0, 2, 1, 5, 3, 4};
//        int[] res = buildArray(arr);
        int[] res=generateArray(arr);
        System.out.println(Arrays.toString(res));

    }


    public static int[] generateArray(int[] nums){
        int[] ans= new int[nums.length];
        for (int i = 0; i <= nums.length-1; i++) {
            ans[i]=nums[nums[i]];
        }
        return ans;
    }

}
