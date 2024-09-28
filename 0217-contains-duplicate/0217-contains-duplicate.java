class Solution {
    public boolean containsDuplicate(int[] nums) {
        // Arrays.sort(nums); 
        // for (int i = 0; i < nums.length - 1; i++) {
        //         if (nums[i] == nums[i+1]) {
        //             return true;
        //         }
        // }
        // return false;
        
        Set<Integer> visited = new HashSet<>();
        
        for(int i = 0; i< nums.length; i++) {
            if(visited.contains(nums[i])) {
                return true;
            } else {
                visited.add(nums[i]);
            }
        }
        return false;
    }
}