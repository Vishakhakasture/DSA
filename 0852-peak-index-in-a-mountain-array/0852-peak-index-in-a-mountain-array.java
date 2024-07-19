class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while(start < end) {
            int mid = start + (end - start) / 2;
            if(arr[mid] > arr[mid+1]) {
                // dec part of array this may be ans but look for left 
                end = mid;
            } else {
                // asce part of array 
                start = mid + 1; // because mid+1 > mid elemet 
            }
        }
        // in the end start == end and pointing to the largest element
        // start and end alwayas try to fing largest element in above two checks
        // hence they are pointing to just one element that is the maximum element
        // more elaboration at every point of time for start and end they have the best possible answer till that poin 
        // and if we are saying that only one item is remaining in above line that is the best possible answer
        return start;
        //we can return start or end as bot at equal position 
    }
}