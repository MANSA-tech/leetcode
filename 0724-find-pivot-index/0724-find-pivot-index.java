class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length;
        int[] prefix = new int[n];
        int[] suffix = new int[n];

        // Build prefix sum
        prefix[0] = nums[0];
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + nums[i];
        }

        // Build suffix sum
        suffix[n - 1] = nums[n - 1];
        for (int j = n - 2; j >= 0; j--) {
            suffix[j] = suffix[j + 1] + nums[j];
        }

        // Find pivot index
        for (int i = 0; i < n; i++) {
            if (prefix[i] == suffix[i]) {
                return i;
            }
        }

        return -1;
    }
}
