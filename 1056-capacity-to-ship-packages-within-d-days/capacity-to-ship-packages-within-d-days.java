class Solution {
    public boolean isPossible(int[] weights, int days, int cap) {
        int day = 1;
        int load = 0;
        for (int i = 0; i < weights.length; i++) {
            if (load + weights[i] > cap) {
                day++;
                load = weights[i];
            } else {
                load += weights[i];
            }
        }
        return day <= days;
    }
    public int shipWithinDays(int[] weights, int days) {
        int s = 0, e = 0;
        
        for (int i = 0; i < weights.length; i++) {
            s = Math.max(s, weights[i]);
            e += weights[i];
        }
        int ans = -1;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            boolean flag = isPossible(weights, days, mid); 
            if (flag == true) {
                ans = mid;
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }
        return ans;
    }
}