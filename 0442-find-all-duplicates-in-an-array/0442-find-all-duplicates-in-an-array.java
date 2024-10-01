class Solution {
    public List<Integer> findDuplicates(int[] nums) {
       List<Integer> result = new ArrayList<>();
        
        // Traverse the array
        for (int i = 0; i < nums.length; i++) {
            // Find the index corresponding to the number's value (use absolute value)
            int index = Math.abs(nums[i]) - 1;
            
            // If the value at the index is negative, the number has appeared before
            if (nums[index] < 0) {
                result.add(index + 1);
            } else {
                // Mark the number as visited by making the value at that index negative
                nums[index] = -nums[index];
            }
        }
        
        return result;
    }
}