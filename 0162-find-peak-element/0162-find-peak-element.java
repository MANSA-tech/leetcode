class Solution {
    public int findPeakElement(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] < nums[mid + 1]) {
                left = mid + 1;   // peak right me hai
            } else {
                right = mid;      // peak left me ya mid pe hai
            }
        }

        return left; // left == right, wahi ek peak index hai
    }
}