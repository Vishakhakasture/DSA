class Solution {

    public boolean canSortArray(int[] nums) {
        int[] values = Arrays.copyOf(nums, nums.length);

        int n = values.length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (values[j] <= values[j + 1]) {
                    continue;
                } else {
                    if (
                        setBitCount(values[j]) ==
                        setBitCount(values[j + 1])
                    ) {
                        int temp = values[j];
                        values[j] = values[j + 1];
                        values[j + 1] = temp;
                    } else {
                        return false;
                    }
                }
            }
        }
        return true;
    }
    public int setBitCount(int n) {
        int count = 0;
        while(n > 0) {
            if((n & 1) == 1) {
                count++;
            }
            n = n >> 1;
        }
        return count;
    }
}
