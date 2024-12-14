class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        Map<Character, Integer> orderMap = new HashMap<>();
        
        // add all letters from srder to hashmap 
        for(int i = 0; i < order.length(); i++) {
            orderMap.put(order.charAt(i),i);
        }
        
        // it will iterate on words string array for each word
        // words.length - 1 because we just compare it with secondlast not an last indesed word 
        for(int i = 0; i < words.length-1; i++) {
            // this will check fro each character letter in words word
            for(int j = 0; j < words[i].length(); j++) {
                //if the length of first word is > length of second word -> false
                if(j >= words[i+1].length()) {
                    return false;
                }
                // if the words are not equal then check for their order 
                if(words[i].charAt(j) != words[i+1].charAt(j)) {
                    // it points to the current letter postion in order 
                    int currLetter = orderMap.get(words[i].charAt(j));
                    // it points to the next words first letter pos in order
                    int nextLetter = orderMap.get(words[i+1].charAt(j));
                    //it compares the letters position
                    if(nextLetter < currLetter) {
                        return false;
                    } else {
                        break; // if pair in words have matching values
                    }
                }
            }
        }
        return true;
    }
}