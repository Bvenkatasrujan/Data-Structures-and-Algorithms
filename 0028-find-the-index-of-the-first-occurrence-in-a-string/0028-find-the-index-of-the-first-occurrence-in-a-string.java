class Solution {
    public int strStr(String haystack, String needle) {
    int n = haystack.length();
    int m = needle.length();

    // Try each possible starting position
    for (int i = 0; i <= n - m; i++) {
        int j = 0;
        // Compare needle with haystack starting at position i
        while (j < m && haystack.charAt(i + j) == needle.charAt(j)) {
            j++;
        }
        // If we matched all characters of needle, return the start
        if (j == m) {
            return i;
        }
    }

    return -1;
}
}