class Solution {
    public int singleNumber(int[] nums) {
        Map<Integer, Integer> mapAll=new HashMap();
        Map<Integer, Integer> mapOne=new HashMap();

        for(int i=0; i<nums.length; i++){
            if(!mapAll.containsKey(nums[i])){
                mapAll.put(nums[i],1);
                mapOne.put(nums[i],1);
            }
            else{
                if(mapOne.containsKey(nums[i])){
                    mapOne.remove(nums[i]);
                }
            }
        }
        
        return mapOne.keySet().stream().toList().get(0);
    }
}