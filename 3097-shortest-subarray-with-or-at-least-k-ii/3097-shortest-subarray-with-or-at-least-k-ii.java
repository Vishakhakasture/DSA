class Solution {
    public int minimumSubarrayLength(int[] nums, int k) {
        int left = 1;
        int right = nums.length;
        int minLength = -1;
        while(left <= right) {
            int mid = left + (right - left) / 2;
            if(hasValidSubarray(nums, k, mid)) {
                minLength = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return minLength;
    }
    public boolean hasValidSubarray(int nums[], int targetSum, int windowsize)     {
        int arrayLength = nums.length;
        int bitCounts[] = new int[32];
        for(int right = 0; right < arrayLength; right++) {
            updateBitCounts(bitCounts, nums[right], 1);
            if(right >= windowsize) {
                updateBitCounts(bitCounts, nums[right - windowsize], -1);
            }
            if(right >= windowsize - 1 && convertBitCountsToNumber(bitCounts) >= targetSum) {
                return true;
            }
        }
        return false;
    }
    public void updateBitCounts(int bitCounts[], int number, int delta) {
        for(int pos = 0; pos < 32; pos++) {
            if(((number >> pos) & 1) != 0) {
                bitCounts[pos] += delta;
            }
        }
    }
    public int convertBitCountsToNumber(int bitCounts[]) {
        int number = 0;
        for(int pos = 0; pos < 32; pos++) {
            if(bitCounts[pos] != 0) {
                number |= 1 << pos;
            }
        }
        return number;
    }
}