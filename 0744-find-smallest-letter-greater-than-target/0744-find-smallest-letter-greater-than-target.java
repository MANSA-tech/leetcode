class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int left = 0;
        int right = letters.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (letters[mid] > target) {
                right = mid - 1;   // maybe earlier valid letter exists
         } else {
                left = mid + 1;    // need bigger letter
            }
        }// circular case
        if (left == letters.length) {
            return letters[0];   // circular case
        } else {
            return letters[left];
        }
    }
}