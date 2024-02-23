class Solution {
    public int removeElement(int[] nums, int val) {
        int k = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                int temp = nums[k];
                nums[k] = nums[j];
                nums[j] = temp;
                k++;
            }
        }
        return k;
    }
}