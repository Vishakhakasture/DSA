class Solution {
    public int maximumWealth(int[][] accounts) {
        int ans = Integer.MIN_VALUE;
        for(int cust = 0; cust < accounts.length; cust++) {
            int accountSum = 0;
            for(int account = 0; account < accounts[cust].length; account++) {
                accountSum += accounts[cust][account];
            }
            if(accountSum > ans) {
                ans = accountSum;
            }
        }
        return ans;
    }
}