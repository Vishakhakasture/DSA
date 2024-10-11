class Solution {
    public int addDigits(int num) {
        
        int res = 0;
        if(num == 0) {
            return 0;
        }
        
        while(num > 0) {
            int rem = num % 10;
            res = res + rem;
            num = num / 10;
            
            if(num == 0 && res > 9) {
                num = res;
                res = 0;
            }
        }
        return res;
    }
}