class Solution {
    private double pow(double x, long n){
        if(n == 0) return 1.0;

        if(n ==1) return x;
        if(n %2 == 0){
            return pow(x*x, n/2);
        }
        return x*pow(x,n-1);
    }
    public double myPow(double x, int n) {
          long n1 = n;
          if(n1 <0) {
            return (1.0/pow(x, -n1));
          }
          return pow(x,n1);
    }
}