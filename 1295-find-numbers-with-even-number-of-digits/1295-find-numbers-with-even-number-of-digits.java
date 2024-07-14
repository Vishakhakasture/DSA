class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        for(int num: nums) {
            if(even(num))
                count++;
        }
        return count;
    }
    public static boolean even(int num) {
        int numOfDigits = digits(num);
        return numOfDigits % 2 == 0;
    } 
    public static int digits(int num) {
        int count = 0;
        while(num > 0) {
            count++;
            num /= 10;
        }
        return count;
    }
}