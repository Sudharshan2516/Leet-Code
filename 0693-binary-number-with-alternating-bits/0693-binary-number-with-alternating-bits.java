class Solution {
    public boolean hasAlternatingBits(int n) {
        int Xor = (n >> 1) ^ n;
        return (Xor & (Xor + 1)) == 0;
    }
}