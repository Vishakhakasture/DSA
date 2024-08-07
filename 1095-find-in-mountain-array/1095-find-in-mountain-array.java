/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
/*
1. find peak element
2. search in ascending array (0,4)
3. search in second array descending array (5,6)
4. if not found return -1
*/
 
class Solution{
  
int findInMountainArray(int target, MountainArray A) {
    int n = A.length(), l, r, m, peak = 0;
    // find index of peak
    l  = 0;
    r = n - 1;
    while (l < r) {
        m = (l + r) / 2;
        if (A.get(m) < A.get(m + 1))
            l = peak = m + 1;
        else
            r = m;
    }
    // find target in the left of peak
    l = 0;
    r = peak;
    while (l <= r) {
        m = (l + r) / 2;
        if (A.get(m) < target)
            l = m + 1;
        else if (A.get(m) > target)
            r = m - 1;
        else
            return m;
    }
    // find target in the right of peak
    l = peak;
    r = n - 1;
    while (l <= r) {
        m = (l + r) / 2;
        if (A.get(m) > target)
            l = m + 1;
        else if (A.get(m) < target)
            r = m - 1;
        else
            return m;
    }
    return -1;
}

}