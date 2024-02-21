class Solution {
    public int diagonalSum(int[][] mat) {
        int sum = 0;
        for(int i=0; i<mat.length; i++) {
            //primary diagonal
            sum += mat[i][i];
            //seconadary diagonal
            if(i != mat.length-1-i)
                sum += mat[i][mat.length-i-1];
        }
        return sum;
    }
}