/*
1.find th pivot in the array (largest number in the array) form where next elements are sorted in ascending [4,5,6,7,0,1,2]
if(nums[mid] > nums[mid+1]) then pivot = nums[mid]
2. search in first half (0,pivot)
3. if not found, search in second half (pivot+1, nums.length)

*/

class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length - 1;
        int pivot = findPivot(nums,n);
        if(pivot == -1) {
            return binarySearch(nums, target, 0, n);
        }
        if(target == nums[pivot]) {
            return pivot;
        }
        if(target >= nums[0]) {
            return binarySearch(nums, target, 0, pivot - 1);
        }
        return binarySearch(nums, target, pivot+1, n);
    }
    public int binarySearch(int[] arr, int target, int start, int end) {
        while(start <= end) {
            int mid = start + (end - start) / 2;
            if(target < arr[mid]) {
                end = mid - 1;
            } else if(target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
    public int findPivot(int[] nums, int end) {
        int start = 0;
        while(start <= end) {
            int mid = start + (end - start) / 2;
            if(mid < end && nums[mid] > nums[mid+1]) {
                return mid;
            }
            if(mid > start && nums[mid] < nums[mid-1]) {
                return mid-1;
            }
            if(nums[mid] <= nums[start]) {
                end = mid - 1;
            } 
            else {
                start = mid + 1;
            }
        }
        return -1;
    }
}