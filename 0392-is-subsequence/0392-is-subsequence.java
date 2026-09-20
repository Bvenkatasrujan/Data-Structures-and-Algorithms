class Solution {
    public boolean isSubsequence(String s, String t) {
int i = 0;

    // Traverse through t
    for (int j = 0; j < t.length(); j++) {
        // If we found all characters in s
        if (i == s.length()) {
            return true;
        }
        // If characters match, move pointer in s
        if (s.charAt(i) == t.charAt(j)) {
            i++;
        }
    }

    // Check if we found all characters
    return i == s.length();
    }
}