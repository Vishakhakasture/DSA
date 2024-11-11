class Solution {
    public String compressedString(String word) {
        StringBuilder result = new StringBuilder("");
        int pos = 0;
        while(pos < word.length()) {
            int count = 0;
            char currChar = word.charAt(pos);
            while(pos < word.length() && count < 9 && word.charAt(pos) == currChar){
                count++;
                pos++;
            }
            result.append(count).append(currChar);
        }
        return result.toString();
    }
}