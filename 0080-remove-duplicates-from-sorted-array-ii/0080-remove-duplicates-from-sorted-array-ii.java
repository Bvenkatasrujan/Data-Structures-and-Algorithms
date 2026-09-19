class Solution {
   public int removeDuplicates(int[] nums) {
    if (nums.length <= 2) return nums.length;

    // First two elements are always valid
    int writePos = 2;

    for (int i = 2; i < nums.length; i++) {
        // Compare with element two positions back in result
        if (nums[i] != nums[writePos - 2]) {
            nums[writePos] = nums[i];
            writePos++;
        }
    }

    return writePos;
}
}