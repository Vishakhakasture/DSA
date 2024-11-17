class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left = 0, right = 0, currSum = 0;
        int res = Integer.MAX_VALUE;

        for(right = 0; right < nums.length; right++) {
            currSum += nums[right];

            while (currSum >= target) {
                res = Math.min(res, right - left + 1);
                currSum -= nums[left++];
            }
        }

        return res == Integer.MAX_VALUE ? 0 : res;
    }
}