class Solution {
    public int[] evenOddBit(int n) {
        String binaryString = Integer.toBinaryString(n);
        char[] ch = binaryString.toCharArray();
        int eve =0;
        int odd = 0;
        int le = ch.length;

        for(int i = 0;i<le;i++){
            int bit = le-1-i;
            if(ch[bit] == '1'){
                if(i%2 ==0) eve++;
             else odd++;
            }
        }
            return new int[]{eve, odd};
    }
}