class Solution {
    public int minOperations(String s) {

        int pattern1 = 0; // Mismatches for 010101...
        int pattern2 = 0; // Mismatches for 101010...

        for (int i = 0; i < s.length(); i++) {

            char current = s.charAt(i);

            // Pattern 1 : 010101...
            if (i % 2 == 0) {
                if (current != '0') {
                    pattern1++;
                }
            } else {
                if (current != '1') {
                    pattern1++;
                }
            }

            // Pattern 2 : 101010...
            if (i % 2 == 0) {
                if (current != '1') {
                    pattern2++;
                }
            } else {
                if (current != '0') {
                    pattern2++;
                }
            }
        }

        return Math.min(pattern1, pattern2);
    }
}