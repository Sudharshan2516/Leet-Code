class Solution {
    public int reverse(int x) {
        int rv = 0;
        while (x != 0) {
            int rem = x % 10;

            // Check for overflow before updating rv
            if (rv > Integer.MAX_VALUE / 10 || (rv == Integer.MAX_VALUE / 10 && rem > 7)) return 0;
            if (rv < Integer.MIN_VALUE / 10 || (rv == Integer.MIN_VALUE / 10 && rem < -8)) return 0;

            rv = rv * 10 + rem;
            x /= 10;
        }
        return rv;
    }
}
