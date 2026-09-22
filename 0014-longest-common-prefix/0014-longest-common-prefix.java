class Solution {
    public String longestCommonPrefix(String[] strs) {
    if (strs.length == 0) {
        return "";
    }

    // Sort so first and last strings are most different
    Arrays.sort(strs);
    String first = strs[0];
    String last = strs[strs.length - 1];

    int i = 0;
    int limit = Math.min(first.length(), last.length());
    while (i < limit && first.charAt(i) == last.charAt(i)) {
        i++;
    }

    return first.substring(0, i);
}
}