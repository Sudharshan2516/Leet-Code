class Solution {
    public boolean isPerfectSquare(int num) {
        double res = Math.sqrt(num);
        if(res == Math.floor(res)){
            return true;
        }
        return false;
    }
}