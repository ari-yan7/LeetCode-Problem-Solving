class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> result = new ArrayList<>();
        int rows = matrix.length;
        int columns = matrix[0].length;
        int rowbegin = 0;
        int rowend = rows - 1;
        int colbegin = 0;
        int colend = columns - 1;
        while(rowbegin <= rowend && colbegin <= colend){
            // right
            for (int i = colbegin; i <= colend; i++){
                result.add(matrix[rowbegin][i]);
            }
            rowbegin++;
            // down
            for (int i = rowbegin; i <= rowend; i++){
                result.add(matrix[i][colend]);
            }
            colend--;
            // left
            if (rowbegin <= rowend){
                for (int i = colend; i >= colbegin; i--){
                    result.add(matrix[rowend][i]);
                }
            }
            rowend--;
            // up
            if (colbegin <= colend){
                for (int i = rowend; i >= rowbegin; i--){
                    result.add(matrix[i][colbegin]);
                }
            }
            colbegin++;
        }
        return result;
    }
}