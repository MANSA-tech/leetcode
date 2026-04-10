class Solution {
    public int longestSubarray(int[] nums) {
        int left =0;
        int count=0;
        int maxlen =0;

        for(int right=0;right<nums.length;right++){
            if(nums[right]==0){
                count++;
            }
          while(count>1){
            if(nums[left]==0){
                count--;
            }
                left++;
            }
            int len= right-left;
          maxlen= Math.max(maxlen,len);
        }
        return maxlen;
    }
}