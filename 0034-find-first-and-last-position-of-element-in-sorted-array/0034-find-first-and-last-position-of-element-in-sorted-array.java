class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans = {-1,-1};
        // check for first occurence of target
        ans[0] = search(nums, target, true); // log n
        if(ans[0] != -1)
            ans[1] = search(nums, target, false); // logn = 2 log n constandt are not counted
         
        return ans;
    }
        
    // these function returns index value of target
    int search(int[] nums,int target, boolean findStartIndex) {
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;
        while(start <= end) {
            int mid = start + (end - start) / 2;
            if(target < nums[mid]) {
                end = mid - 1;
            }
            else if(target > nums[mid]) {
                start = mid + 1;
            } else {
                ans = mid;
                if(findStartIndex) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
         }
    }        
        
    return ans;
    }
}