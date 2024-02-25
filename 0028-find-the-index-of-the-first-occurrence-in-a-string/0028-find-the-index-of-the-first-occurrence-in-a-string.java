class Solution {
    public int strStr(String haystack, String needle) {
        if(needle.length()>haystack.length()){
            return -1;
        }
        int left =0 , right = needle.length();
        while(right <= haystack.length()){
            String str = haystack.substring(left, right);
            if(str.equals(needle)){
                return left;
            }
            left++;
            right++;
        }
        return -1;
    }
}