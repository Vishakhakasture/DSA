class Solution {
    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            // Find the next valid alphanumeric character from the left
            while (left < right && !isAlphanumeric(s.charAt(left))) {
                left++;
            }
            // Find the next valid alphanumeric character from the right
            while (left < right && !isAlphanumeric(s.charAt(right))) {
                right--;
            }

            // Convert both characters to lowercase manually
            char leftChar = toLowerCase(s.charAt(left));
            char rightChar = toLowerCase(s.charAt(right));

            // Compare the characters
            if (leftChar != rightChar) {
                return false;
            }

            // Move pointers inward
            left++;
            right--;
        }

        return true;
    }

    // Helper method to check if a character is alphanumeric
    private static boolean isAlphanumeric(char c) {
        return (c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z') || (c >= '0' && c <= '9');
    }

    // Helper method to convert a character to lowercase without using toLowerCase()
    private static char toLowerCase(char c) {
        if (c >= 'A' && c <= 'Z') {
            return (char) (c + 32); // Convert uppercase to lowercase by adding 32
        }
        return c;
    

    }
}