class Solution {
    public static boolean Check(int[] piles , long h , int mid )
    {
        long totalHrs = 0 ;
        for(int i = 0 ; i < piles.length ; i++)
        {
            totalHrs = totalHrs + (piles[i] + (mid - 1)) / mid ;
        }

        if(totalHrs <= h)
        {
            return true;
        }

        return false;
    }
    public int minEatingSpeed(int[] piles, long h) {
       int s = 1 ; 
       int e = 0 ;
       int res = -1 ;

       for(int i = 0 ; i < piles.length ; i++)
       {
         e = Math.max(e , piles[i]);
       }

       while(s <= e)
       {
            int mid = (s + e)/2;
            
            if(Check(piles , h , mid))
            {
                res = mid;
                e = mid - 1;
            }
            else
            {
                s = mid + 1;
            }

       }

       return res;
    }
}