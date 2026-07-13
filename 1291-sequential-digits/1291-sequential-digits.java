class Solution {
    private int cnt(int num) {
        int cnt = 0;
        while (num > 0) {
            cnt++;
            num /= 10;
        }
        return cnt;

    }

    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> result = new ArrayList<>();
        int lnd = cnt(low);
        int hnd = cnt(high);
        for (int md = lnd; md <= hnd; md++) {
            for (int start = 1; start <= 10 - md; start++) {
                int num = 0;
                for (int sq = start; sq < start + md; sq++) {
                    num = num * 10 + sq;
                }
                if (num >= low && num <= high) {
                    result.add(num);
                }
            }
        }
        return result;
    }
}