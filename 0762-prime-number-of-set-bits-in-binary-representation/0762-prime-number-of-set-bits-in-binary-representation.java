class Solution {
    private int count(int n){
        int count = 0;
        while(n != 0){
            n &= (n-1);
            count++;
        }
        return count;
    }
    public int countPrimeSetBits(int left, int right) {
     boolean[] primes = new boolean[33];
        int[] prime =  {2,3,5,7,11,13,17,19,23,29,31};
        for(int p : prime) primes[p] = true;
        int set =0;
        for(int i =left; i<= right;i++){
            int Sp = count(i);
            if(primes[Sp])set++;
        }
        return set;
    }
}