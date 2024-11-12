class Solution {
    public int[] maximumBeauty(int[][] items, int[] queries) {
        int ans[] = new int[queries.length];
        Arrays.sort(items, (a, b) -> a[0] - b[0]);
        int max = items[0][1];
        for(int i = 0; i < items.length; i++) {
            max = Math.max(max,items[i][1]);
            items[i][1] = max;
        }
        for(int i = 0; i < queries.length; i++) {
            ans[i] = binarySearch(items, queries[i]);
        }
        return ans;
    }
    public int binarySearch(int items[][], int targetPrice) {
        int left = 0;
        int right = items.length - 1;
        int maxBeauty = 0;
        while(left <= right) {
            int mid = (left + right) / 2;
            if(targetPrice < items[mid][0]) {
                right = mid - 1;
            } else {
                maxBeauty = Math.max(maxBeauty, items[mid][1]);
                left = mid + 1;
            }
        }
        return maxBeauty;
    }
}