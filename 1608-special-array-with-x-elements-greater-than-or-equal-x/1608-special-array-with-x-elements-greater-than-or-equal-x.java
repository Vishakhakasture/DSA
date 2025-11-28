class Solution {
    public int specialArray(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;

        if(nums[0] >= n) return n;

        // for(int i = 1; i < n; i++) {
        // if(nums[n - i] >= i && (n - i - 1 < 0 || nums[n - i - 1] < i)) {
        //         return i;
        //     }
        // }
        int low = 0, high = n;
        while(low <= high) {
            int mid = low + (high - low) / 2;
            int count = 0;
            for(int num : nums) {
                if(num >= mid) {
                    count++;
                }
            }
            if(count == mid) {
                return mid;
            } else if(count > mid) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }
} 