class Solution {
    public char processStr(String s, long k) {

        int n = s.length();
        long[] len = new long[n];

        long curr = 0;

        // Forward pass: store lengths
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);

            if (c >= 'a' && c <= 'z') {
                curr++;
            } else if (c == '*') {
                if (curr > 0) curr--;
            } else if (c == '#') {
                curr *= 2;
            }
            // % does not change length

            len[i] = curr;
        }

        if (k < 0 || k >= curr) {
            return '.';
        }

        // Backward pass
        for (int i = n - 1; i >= 0; i--) {

            char c = s.charAt(i);
            long after = len[i];
            long before = (i == 0) ? 0 : len[i - 1];

            if (c >= 'a' && c <= 'z') {

                if (k == before) {
                    return c;
                }

            } else if (c == '%') {

                k = after - 1 - k;

            } else if (c == '#') {

                if (k >= before) {
                    k -= before;
                }

            } else if (c == '*') {

                // length changed from before to after = before - 1
                // existing indices remain unchanged

            }
        }

        return '.';
    }
}