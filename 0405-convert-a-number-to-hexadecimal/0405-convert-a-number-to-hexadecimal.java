class Solution {
    public String toHex(int num) {
       if(num == 0){
        return "0";
       } if(num<0){
            return Integer.toHexString(num);
        }
        String result = "";
        char[] hexD = {'0','1','2','3','4','5','6','7','8','9','a','b','c','d','e','f'};
        while(num>0){
            int re = num%16;
            result += hexD[re];
            num = num/16;
        }
        return new StringBuilder(result).reverse().toString();
    }
}