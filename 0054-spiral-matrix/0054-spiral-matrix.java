class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<Integer>();
        int startRow=0;
        int startCol=0;
        int endRow=matrix.length-1;
        int endCol=matrix[0].length-1;
        while(startRow <= endRow && startCol <= endCol) {
            //top 
            for(int j=startRow; j<=endCol; j++) {
                ans.add(matrix[startRow][j]);
            }
            //right
            for(int i=startRow+1; i<=endRow; i++) {
                ans.add(matrix[i][endCol]);
            }
            //bottom
            for(int j=endCol-1; j>=startRow; j--) {
                if(startRow == endRow) {
                    break;
                }
                ans.add(matrix[endRow][j]);
            }
            //left
            for(int i=endRow-1; i>=startRow+1; i--) {
                if(startCol == endCol) {
                    break;
                }
                ans.add(matrix[i][startCol]);
            }
            startRow++;
            startCol++;
            endRow--;
            endCol--;
        }
        return ans;
    }
    
}