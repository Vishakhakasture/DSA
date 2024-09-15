class Solution {
    public int reverse(int x) {
        int res = 0;
        while(x != 0) {
            if (res > Integer.MAX_VALUE/10 || res < Integer.MIN_VALUE/10)
                return 0;
            int rem = x%10;
            res = res*10 + rem;
            x = x/10;
        }
        return res;
    }
}