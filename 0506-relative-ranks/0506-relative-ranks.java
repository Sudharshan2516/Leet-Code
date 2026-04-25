class Solution {
    public String[] findRelativeRanks(int[] score) {
        int n = score.length;
        int store[][] = new int[n][2];
        for(int i = 0; i<n; i++){
           store[i][0] = score[i];
           store[i][1] = i;
        }
        Arrays.sort(store, (a,b) -> b[0] - a[0]);
        String [] result = new String[n];
      for(int i = 0; i<n; i++){
        int orgI  = store[i][1];
        if(i == 0){
            result[orgI] = "Gold Medal";
        }
        else if(i ==1){
            result[orgI] = "Silver Medal";
        }
        else if(i == 2){
            result[orgI] = "Bronze Medal";
        }
        else{
            result[orgI] = String.valueOf(i+1);
        }
      }
      return result;
    }
}