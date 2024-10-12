class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int ans[] = new int[n];
        Stack<Integer> s = new Stack<>();
        
        for(int i = 0; i < n; i++) {
            while(!s.isEmpty() && temperatures[i] > temperatures[s.peek()]) {
                int index = s.pop();
                ans[index] = i - index;
            }
            s.push(i);
        }
        
        return ans;
    }
}