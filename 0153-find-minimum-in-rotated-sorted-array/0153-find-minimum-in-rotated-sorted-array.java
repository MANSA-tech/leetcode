class Solution {
    public int findMin(int[] nums) {
        int left=0;
        int right=nums.length-1;
        while(left<right){
            int mid=left+(right-left)/2;
            if(nums[mid]>nums[right]){
                left=mid+1;
            }else{
                right=mid;
            }
        }                /*mid se right tak part sorted hai

aur kyunki sorted hai, us part me sabse chhota mid hi hoga

toh minimum:

mid pe ho sakta hai

ya mid ke left side me ho sakta hai

👉 Isliye:

right = mid*/
        return nums[left];
    }
}