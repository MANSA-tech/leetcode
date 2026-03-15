class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int n = arr.length;      // array ki length
        int current = 0;         // current window ka sum
        int count = 0;           // valid windows count

        // first window ka sum nikaalo
        for (int i = 0; i < k; i++) {
            current += arr[i];
        }

        // first window check karo
        if (current >= k * threshold) {
            count++;
        }

        // baaki windows slide karo
        for (int i = 1; i <= n - k; i++) {
            current = current - arr[i - 1] + arr[i + k - 1];
            // old first remove + new last add

            if (current >= k * threshold) {
                count++;
            }
        }

        return count;
    }
}