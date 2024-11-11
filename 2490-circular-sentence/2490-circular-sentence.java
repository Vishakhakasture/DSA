class Solution {
    public boolean isCircularSentence(String sentence) {
        String words[] = sentence.split(" ");
        int n = words.length;
        char ch = words[n-1].charAt(words[n-1].length() - 1);
        for(int i = 0; i < n; i++) {
            if(words[i].charAt(0) != ch) return false;
            ch = words[i].charAt(words[i].length() - 1);
        }
        return true;
    }
}