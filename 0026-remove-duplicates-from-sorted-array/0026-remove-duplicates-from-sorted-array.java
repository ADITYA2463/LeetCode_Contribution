class Solution {
    public int removeDuplicates(int[] nums) {
        int l = 0 , r  = 0 , cnt = 1;

        while(r < nums .length)
        {
            if(nums[r] != nums[l] && l <= r)
            {
               nums[l + 1] = nums[r];
               l++;
               cnt++;
            }
            r++;
        }

    return cnt ;  
        
    }
}