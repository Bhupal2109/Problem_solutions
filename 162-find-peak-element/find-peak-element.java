class Solution {
    public int findPeakElement(int[] nums) {
        int l =0;
        int h = nums.length-1;
        while(l<h){
            int m = l+(h-l)/2;
            if(nums[m]<nums[m+1]){
                l = m+1;
            }if(nums[m]>nums[m+1]){
                h = m;
            }
        }

        return l;
    }
}