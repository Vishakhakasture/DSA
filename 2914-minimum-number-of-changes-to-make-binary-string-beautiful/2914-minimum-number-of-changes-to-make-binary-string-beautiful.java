class Solution {
    public int minChanges(String s) {
        char currChar = s.charAt(0);
        int count = 0;
        int change = 0;
        for(int i = 0; i < s.length(); i++) {
            if(currChar == s.charAt(i)) {
                count++;
                continue;
            }
            if(count % 2 == 0) {
                count = 1;
            } else {
                count = 0;
                change++;
            }
            currChar = s.charAt(i);
            
        }
        
        return change;
    }
}