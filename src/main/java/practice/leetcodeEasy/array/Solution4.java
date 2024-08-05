package practice.leetcodeEasy.array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Solution4 {

    public static int[] getConcatention(int[] nums){
        int[] ans=new int[2*nums.length];
        for (int i = 0; i < nums.length; i++) {
            ans[i]=nums[i];
            ans[i+nums.length]=nums[i];
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr={1,3,5,7};
        int[] res=getConcatention(arr);
        System.out.println(Arrays.toString(res));
    }


}
