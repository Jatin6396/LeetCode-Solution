class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] arr = new int[128]; // support all ASCII characters
        int total = 0, first = 0, second = 0;

        while (second < s.length()) {
            while (arr[s.charAt(second)] == 1) {
                arr[s.charAt(first)] = 0;
                first++;
            }
            arr[s.charAt(second)] = 1;
            total = Math.max(total, second - first + 1);
            second++;
        }

        return total;
    }
}
