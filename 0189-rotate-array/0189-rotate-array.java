class Solution {
    public void rotate(int[] nums, int k) {
    int n = nums.length;
    k = k % n;
    int[] result = new int[n];

    // Place each element at its rotated position
    for (int i = 0; i < n; i++) {
        result[(i + k) % n] = nums[i];
    }

    // Copy back to original array
    for (int i = 0; i < n; i++) {
        nums[i] = result[i];
    }
}
}