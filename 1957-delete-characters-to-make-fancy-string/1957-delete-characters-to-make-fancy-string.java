class Solution {
    public String makeFancyString(String s) {
        StringBuilder ans = new StringBuilder();
        char prev = s.charAt(0);
        int frequency = 1;
        ans.append(s.charAt(0));
        for(int i = 1; i < s.length(); i++) {
            if(s.charAt(i) == prev) {
                frequency++;
            } else {
                prev = s.charAt(i);
                frequency = 1;
            }
            if(frequency < 3) {
                ans.append(s.charAt(i));
            }
        }
        return ans.toString();
        
    }
}