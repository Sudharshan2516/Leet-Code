class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int m = grid.length, n = grid[0].length;
        if(k == 0) return Arrays.stream(grid)
            .map(row -> Arrays.stream(row)
                              .boxed()
                              .collect(Collectors.toList()))
            .collect(Collectors.toList());
        int[][] ans = new int[m][n];
        for(int t = 0; t < k; t++){
            ans[0][0] = grid[m-1][n-1];
            for(int i = 0; i< m; i++){
                for(int j = 0; j < n; j++){
                    if(i == m-1 && j == n-1){
                        break;
                    }
                    else if(j == n-1){
                        ans[i+1][0] = grid[i][j];
                    }
                    else{
                        ans[i][j+1] = grid[i][j];
                    }
                }
            }
              IntStream.range(0, ans.length).forEach(i -> 
            System.arraycopy(ans[i], 0, grid[i], 0, ans[i].length)
        );
        }
        return Arrays.stream(ans)
            .map(row -> Arrays.stream(row)
                              .boxed()
                              .collect(Collectors.toList()))
            .collect(Collectors.toList());
    }
}