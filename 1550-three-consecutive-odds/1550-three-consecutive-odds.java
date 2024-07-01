class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        int count = 0;
        for (int i = 0; i < 3 && i < arr.length; i++) {
            count += arr[i] % 2;
        }
        if (count == 3) {
            return true;
        }
        for (int i = 3; i < arr.length; i++) {
            count += arr[i] % 2;
            count -= arr[i - 3] % 2;
            if (count == 3) {
                return true;
            }
        }
        return false;
    }
}