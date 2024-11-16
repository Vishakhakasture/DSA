class Solution {
    public int[] resultsArray(int[] nums, int k) {
        int n = nums.length;
        int ans[] = new int[n - k + 1];
        Deque<Integer> dq = new ArrayDeque<>();
        for(int i = 0; i < n; i++) {
            if(!dq.isEmpty() && dq.peekFirst() < i - k + 1) {
                dq.pollFirst();
            }
            if(!dq.isEmpty() && nums[i] != nums[i-1]+1) {
                dq.clear();
            }
            dq.offerLast(i);
            if(i >= k - 1) {
                if(dq.size() == k) {
                    ans[i-k+1] = nums[dq.peekLast()];
                } else {
                    ans[i-k+1] = -1;
                }
            }
        }
        return ans;
    }
}