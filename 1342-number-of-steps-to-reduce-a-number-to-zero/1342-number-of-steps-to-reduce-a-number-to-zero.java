class Solution {
    public int numberOfSteps(int num) {
        int cnt = 0;
        while(num > 0){
        if(num % 2 != 0){
            num -= 1;
            cnt++;
        }
        else{
            num = num/2;
            cnt++;
        }
        }
        return cnt;
    }
}