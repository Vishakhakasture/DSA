class Solution {
    public int largestCombination(int[] candidates) {
        int bitCount[] = new int[24];
        for(int i = 0; i < bitCount.length; i++) {
            for(int num: candidates) {
                if((num & (1 << i)) != 0) {
                    bitCount[i]++;
                }
            }
        }
        int max = 0;
        for(int count: bitCount) {
            if(count > max) {
                max = count;
            }
        }
        return max;
    }
}