class Solution {
    public int numberOfSubstrings(String s) {
         int r = 0 , maxCount = 0 ; 
        int[] arr = new int[]{-1 , -1 , -1};

        while(r < s.length())
        {
            arr[s.charAt(r) - 'a'] = r;

            if(arr[0] != -1 &&  arr[1] != -1 &&  arr[2] != -1)
            {
                maxCount = maxCount + Math.min(arr[0] , Math.min(arr[1] , arr[2])) + 1;
            }
            r++;
        }

        return maxCount ;
        
    }
}