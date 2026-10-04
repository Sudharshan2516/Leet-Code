class Solution {
    public int[][] restoreMatrix(int[] rowSum, int[] colSum) {
        int n = rowSum.length;
        int m = colSum.length;
        int[][] res = new int[n][m];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                int cval = Math.min(rowSum[i], colSum[j]);
                res[i][j] = cval;
                rowSum[i] = rowSum[i] - cval;
                colSum[j] = colSum[j] - cval;
            }
        }
        return res;
    }
}