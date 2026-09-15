class Solution {
    public void moveZeroes(int[] nums) {
        int zero[]=new int[nums.length];
        int n=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=0)
            {
                zero[n]=nums[i];
                n++;
            }
        }
        for(int i=0;i<nums.length;i++)
        {
            nums[i]=zero[i];
        }

    }
}