class Solution {
    public int gcdOfOddEvenSums(int n) {
        int SumOdd = n*n;
        int sumEve = n*(n+1);
        return gcd(SumOdd, sumEve);
    }
    private int gcd(int a, int b){
        if(b== 0){
            return a;
        }
        return gcd(b, a%b);
    }
}