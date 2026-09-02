class Solution {
    public int findMin(int[] nums) {
        int l =0;
        int h = nums.length-1;
        int ans = Integer.MAX_VALUE;

      if(nums.length<2){
        return nums[0];
      }
        while(l<=h){
            int m = l+(h-l)/2;
           if(nums[l]==nums[m] && nums[m]==nums[h]){
            ans = Math.min(ans, nums[l]);
            l = l+1;
            h = h-1;
            continue;
           }
           else if(nums[l]<=nums[m]){
            ans = Math.min(ans,nums[l]);
           l = m+1;
           }else{
            ans = Math.min(ans,nums[m]);
            h = m;
           }
        }
        return ans;
    }
}