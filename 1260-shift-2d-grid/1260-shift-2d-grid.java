class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int m = grid.length;
        int n = grid[0].length;

        List<List<Integer>> currentGrid = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                row.add(grid[i][j]);
            }
            currentGrid.add(row);
        }

        for (int t = 0; t < k; t++) {
            List<List<Integer>> ans = new ArrayList<>();
            for (int i = 0; i < m; i++) {
                List<Integer> row = new ArrayList<>();
                for (int j = 0; j < n; j++) {
                    row.add(0); 
                }
                ans.add(row);
            }

            ans.get(0).set(0, currentGrid.get(m - 1).get(n - 1));

            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (i == m - 1 && j == n - 1) {
                        continue; 
                    } else if (j == n - 1) {
                        ans.get(i + 1).set(0, currentGrid.get(i).get(j));
                    } else {
                        ans.get(i).set(j + 1, currentGrid.get(i).get(j));
                    }
                }
            }

            currentGrid = ans;
        }

        return currentGrid;
    }
}
