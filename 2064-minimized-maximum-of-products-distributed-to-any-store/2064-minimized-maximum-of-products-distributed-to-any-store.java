class Solution {
    public int minimizedMaximum(int n, int[] quantities) {
        int left = 0;
        int right = 0;
        for(int quantity : quantities) {
            if(quantity > right) {
                right = quantity;
            }
        }
        while(left < right) {
            int mid = (left + right)/ 2;
            if(canDistribute(mid, quantities, n)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }
    public boolean canDistribute(int x, int quantities[], int n) {
        int j = 0;
        int remaining = quantities[j];
        for(int i = 0; i < n; i++) {
            if(remaining <= x) {
                j++;
                if(j == quantities.length) {
                    return true;
                } else {
                    remaining = quantities[j];
                } 
            } else {
                remaining -= x;
            }
        }
        return false;
    }
}