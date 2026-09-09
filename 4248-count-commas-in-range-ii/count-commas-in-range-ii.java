class Solution {
    public long countCommas(long n) {
        long ans = 0;
        long lowerBound = 1000;
        while (n >= lowerBound) {
            ans += (n - lowerBound + 1);
            if (lowerBound > Long.MAX_VALUE / 1000) {
                break;
            }
            lowerBound *= 1000;
        }
        return ans;
    }
}