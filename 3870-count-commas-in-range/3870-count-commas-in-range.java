class Solution {
    public int countCommas(int n) {
        int cms = 0;
        if(n < 999){
            cms = 0;
        }else{
            for(int i = 1000; i<= n; i++){
                cms++;
            }
        }
        return cms;
    }
}