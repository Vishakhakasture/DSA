class Solution {
    public long countFairPairs(int[] nums, int lower, int upper) {
        int n = nums.length - 1;
        Arrays.sort(nums);
        long ans = 0;
        for(int i = 0; i < nums.length; i++) {
            // no. of pairs which has sum < lower
            long low = lowerBound(nums, i+1, n,lower - nums[i]);
            long high = lowerBound(nums, i + 1, n,upper - nums[i]+1);
            
            ans += 1 * (high - low);
        }
        return ans;
    }
    public int lowerBound(int nums[], int low, int high, int element) {
        while(low <= high) {
            int mid = low + (high - low) / 2;
            if(nums[mid] >= element) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }
}