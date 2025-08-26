class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        int n = dimensions.length;
        int maxA = 0, maxD = 0;
        for(int i =0; i < n; i++){
            int l = dimensions[i][0];
            int w = dimensions[i][1];
            int crrD = l*l + w*w;
            if(crrD> maxD || (crrD == maxD && l*w > maxA) ){
                maxD = crrD;
                maxA = l*w;
            }
        }
        return maxA;
    }
}