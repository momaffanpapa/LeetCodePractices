package practice.leetcodeEasy.arr10ay;

public class Solution5 {

    public static int maximumWealth(int[][] accounts) {
        int richest=0;
        for(int row=0;row<accounts.length;row++){
            int sum=0;
            for(int col=0;col<accounts[row].length;col++){
                sum +=accounts[row][col];
            }
            if(richest<sum){
                richest=sum;
            }
        }
        System.gc();
        return richest;
    }

    public static void main(String[] args) {
        int[][] accounts = {
                                {1,2,3},{3,2,5}
                            };
        System.out.println(maximumWealth(accounts));

    }
}
