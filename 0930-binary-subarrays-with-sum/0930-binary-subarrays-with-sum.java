class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
                // All Subarray with (sum = k) =  (Sum <= k) - (Sum <= k - 1)

        int l = 0 , r = 0 , resForK = 0 , resForKminus1 = 0 , sum = 0 ;

        while(r < nums.length)
        {
            sum = sum + nums[r];

            while(sum > goal && l <= r)
            {
                sum = sum - nums[l];
                l++;
            }

            if(sum <= goal)
            {
                resForK = resForK + (r - l + 1);
            }

            r++;
        }

        r = 0 ; l = 0 ; sum = 0;

        while(r < nums.length)
        {
            sum = sum + nums[r];

            while(sum >= goal  && l <= r)
            {
                sum = sum - nums[l];
                l++;
            }

            if(sum < goal )
            {
                resForKminus1 = resForKminus1 + (r - l + 1);
            }

            r++;
        }

        return resForK - resForKminus1;
    }
}