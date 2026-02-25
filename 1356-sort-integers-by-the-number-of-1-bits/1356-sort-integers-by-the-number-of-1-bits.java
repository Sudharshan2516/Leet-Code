class Solution {
    private int count(int n){
        int cnt=0;
        while(n != 0){
            n &= (n-1);
            cnt++;
        }
        return cnt;
    }
    public int[] sortByBits(int[] arr) {
       
        Integer[] boxed = Arrays.stream(arr).boxed().toArray(Integer[]::new);

        // Sort based on count of set bits, then numeric value
        Arrays.sort(boxed, (a, b) -> {
            int ca = count(a);
            int cb = count(b);
            if (ca == cb)
                return a - b; // if equal set bits, sort numerically
            else
                return ca - cb; // otherwise, sort by set bit count
        });

        // Unbox back to int[]
        return Arrays.stream(boxed).mapToInt(Integer::intValue).toArray();

    }
}