

class Solution {
    public int maxValue(int[][] events, int k) {
        Arrays.sort(events, (a, b) -> Integer.compare(a[1], b[1])); // sort by end time

        int n = events.length;
        int[] endTimes = new int[n];
        for (int i = 0; i < n; i++) endTimes[i] = events[i][1];

        int[][] dp = new int[n + 1][k + 1];

        for (int i = 1; i <= n; i++) {
            int start = events[i - 1][0];
            int value = events[i - 1][2];

            // Binary search to find last non-overlapping event
            int prev = binarySearch(endTimes, start - 1);

            for (int j = 1; j <= k; j++) {
                // Option 1: Skip current
                dp[i][j] = Math.max(dp[i][j], dp[i - 1][j]);
                // Option 2: Take current
                dp[i][j] = Math.max(dp[i][j], dp[prev + 1][j - 1] + value);
            }
        }

        return dp[n][k];
    }

    // Find rightmost index with endTime <= target
    private int binarySearch(int[] endTimes, int target) {
        int left = 0, right = endTimes.length - 1, res = -1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (endTimes[mid] <= target) {
                res = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return res;
    }
}
