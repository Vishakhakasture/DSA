class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length() != goal.length()) return false;
        
        int length = s.length();
        char ch[] = s.toCharArray();
        for(int i = 0; i < length; ++i) {
            ch = rotateOnce(ch);
            if(new String(ch).equals(goal)) return true;
        }
        return false;
    }
    private char[] rotateOnce(char[] arr) {
        char firstch = arr[0];
        System.arraycopy(arr,1,arr,0,arr.length-1);
        arr[arr.length-1] = firstch;
        return arr;
    }
}