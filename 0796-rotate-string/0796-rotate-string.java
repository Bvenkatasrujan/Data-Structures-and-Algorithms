class Solution {
   public boolean rotateString(String s, String goal) {
    if (s.length() != goal.length()) {
        return false;
    }
    // Try every possible rotation
    for (int k = 0; k < s.length(); k++) {
        // Build the k-th rotation: s[k..n-1] + s[0..k-1]
        String rotated = s.substring(k) + s.substring(0, k);
        if (rotated.equals(goal)) {
            return true;
        }
    }
    return false;
}
}