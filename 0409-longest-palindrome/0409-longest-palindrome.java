class Solution {
    public int longestPalindrome(String s) {
    Set<Character> oddChars = new HashSet<>();
    int length = 0;
    for (char c : s.toCharArray()) {
        if (oddChars.contains(c)) {
            // Pair completed, add 2 to length
            oddChars.remove(c);
            length += 2;
        } else {
            // First of a potential pair
            oddChars.add(c);
        }
    }
    // If any unpaired characters remain, one can go in the center
    if (!oddChars.isEmpty()) {
        length++;
    }
    return length;
}
}