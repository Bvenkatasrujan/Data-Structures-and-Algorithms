class Solution {
    public boolean isPalindrome(String s) {
    // Build a cleaned string with only lowercase alphanumeric chars
    StringBuilder filtered = new StringBuilder();
    for (char c : s.toCharArray()) {
        if (Character.isLetterOrDigit(c)) {
            filtered.append(Character.toLowerCase(c));
        }
    }

    String forward = filtered.toString();
    // Compare with its reverse
    String reversed = new StringBuilder(forward).reverse().toString();

    return forward.equals(reversed);
}
}