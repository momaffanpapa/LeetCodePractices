package practice.leetcodeEasy.array;

class Solution1 {
    public static int addDigits(int num) {
        int digitalRoot = 0;
        while (num > 0) {
            digitalRoot += num % 10;
            num = num / 10;

            if (digitalRoot == 0 && num > 9) {
                num = digitalRoot;
                digitalRoot = 0;
            }
        }
        return digitalRoot;
    }

    public static void main(String[] args) {
        System.out.println(addDigits(98797));
    }
}
