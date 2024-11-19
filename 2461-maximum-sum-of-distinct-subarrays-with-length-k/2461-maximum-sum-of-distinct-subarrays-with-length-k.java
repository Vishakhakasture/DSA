class Solution {

    public long maximumSubarraySum(int[] nums, int k) {
        long maxSum = 0;
        long currSum = 0;
        int begin = 0;
        int end = 0;

        HashMap<Integer, Integer> numToIndex = new HashMap<>();

        while (end < nums.length) {
            int currNum = nums[end];
            int lastOccurrence = numToIndex.getOrDefault(currNum, -1);
            while (begin <= lastOccurrence || end - begin + 1 > k) {
                currSum -= nums[begin];
                begin++;
            }
            numToIndex.put(currNum, end);
            currSum += nums[end];
            if (end - begin + 1 == k) {
                maxSum = Math.max(maxSum, currSum);
            }
            end++;
        }
        return maxSum;
    }
}