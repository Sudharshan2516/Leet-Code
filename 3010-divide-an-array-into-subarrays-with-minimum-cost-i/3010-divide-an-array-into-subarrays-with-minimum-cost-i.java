class Solution {
    public int minimumCost(int[] A) {
        int a = A[1], b = A[2];

        for (int i = 1; i < A.length; i++) {
            if (A[i] < a) {
                b = a;
                a = A[i];
            } else if (A[i] < b)
                b = A[i];

            if (a == 1 && b == 1) break;
        }

        return A[0] + a + b;
    }
}