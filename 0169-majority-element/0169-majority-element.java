class Solution {
    public int majorityElement(int[] nums) {
        int count =0;
        int element =0;
        for(int i=0;i<nums.length;i++){
            if(count==0){ // nums mtlb pura array isly nums[i] likho mtlb sirf ek element uska
                element = nums[i];
            }
            if(nums[i]==element)count ++;
            else count--;
        }
        return element;
    }
}