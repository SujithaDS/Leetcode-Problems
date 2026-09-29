class Solution {
    public int[] findDegrees(int[][] matrix) {
        
        int res[] = new int[matrix.length];
        for(int j=0;j<matrix.length;j++){
            int sum =0;
        for(int i=0;i<matrix.length;i++){
            sum += matrix[i][j];
        }
        res[j] = sum;
        }
        return res;
    }
}