class Solution {

    public int shortestSubarray(int[] nums, int k) {
        int n = nums.length;

        // Stack-like list to store cumulative sums and their indices
        List<Pair<Long, Integer>> cumulativeSumStack = new ArrayList<>();
        cumulativeSumStack.add(new Pair<>(0L, -1));

        long runningCumulativeSum = 0;
        int shortestSubarrayLength = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            // Update cumulative sum
            runningCumulativeSum += nums[i];

            // Remove entries from stack that are larger than current cumulative sum
            while (
                !cumulativeSumStack.isEmpty() &&
                runningCumulativeSum <=
                cumulativeSumStack.get(cumulativeSumStack.size() - 1).getKey()
            ) {
                cumulativeSumStack.remove(cumulativeSumStack.size() - 1);
            }

            // Add current cumulative sum and index to stack
            cumulativeSumStack.add(new Pair<>(runningCumulativeSum, i));

            int candidateIndex = findCandidateIndex(
                cumulativeSumStack,
                runningCumulativeSum - k
            );

            // If a valid candidate is found, update the shortest subarray length
            if (candidateIndex != -1) {
                shortestSubarrayLength = Math.min(
                    shortestSubarrayLength,
                    i - cumulativeSumStack.get(candidateIndex).getValue()
                );
            }
        }

        // Return -1 if no valid subarray found
        return shortestSubarrayLength == Integer.MAX_VALUE
            ? -1
            : shortestSubarrayLength;
    }

    // Binary search to find the largest index where cumulative sum is <= target
    private int findCandidateIndex(
        List<Pair<Long, Integer>> nums,
        long target
    ) {
        int left = 0, right = nums.size() - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums.get(mid).getKey() <= target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return right;
    }
}