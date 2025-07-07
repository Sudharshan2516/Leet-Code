class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
     ArrayList<Integer> ans = new ArrayList<>();
        // Approach first i is constant and j increases
        //j is constant i keeps on increases
        //i is constant and j keeps on decrease 
        // j is constant and i keeps on decrease
        int n = matrix.length;
        int m = matrix[0].length;
        int top =0, bottom = n-1, left = 0, right = m-1;
        while(left <=  right &&  top <= bottom){
        for(int i = left;i<=right;i++){
            ans.add(matrix[top][i]);
        }
        top++;
        for(int i = top;i<=bottom;i++ ){
            ans.add(matrix[i][right]);
        }
        right--;
        if(top <= bottom){
        for(int i = right;i>=left;i--){
            ans.add(matrix[bottom][i]);
        }
        bottom--;
        }
        if(left <= right){
        for(int i = bottom; i>=top;i--){
            ans.add(matrix[i][left]);
        }
        left++;
        }
        }

        return ans;
    }
}