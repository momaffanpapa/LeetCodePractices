package practice.leetcodeEasy.array;

import java.util.ArrayList;
import java.util.List;

// 1431. Kids With the Greatest Number of Candies
public class Solution6 {
    public static void main(String[] args) {
        int[] can={2,3,5,1,3};
        int extraCandies = 3;
        Solution6 obj6=new Solution6();
        List<Boolean> result=obj6.kidsWithMAxCandies(can,extraCandies);
        System.out.println(result);
    }


    public List<Boolean> kidsWithMAxCandies(int[] candies, int extraCandies) {
        int max = 0;
        for (int cand : candies) {
            max = Math.max(max, cand);
        }

        List<Boolean> res = new ArrayList<>();
        for (int i = 0; i < candies.length; ++i) {
            res.add(candies[i] + extraCandies >= max);
        }
        return res;
    }
}
