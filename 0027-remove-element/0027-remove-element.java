class Solution {
    public int removeElement(int[] nums, int val) {
             int o[]=new int[nums.length];
        int n=0;
        for(int num:nums)
        {
            if(num!=val)
            {
                o[n]=num;
                n++;
            }
        }
        for(int i=0;i<nums.length;i++)
        {
            nums[i]=o[i];
        }
        return n;
    }
}