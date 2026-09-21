class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l = 0 , r = 0 , maxLen = 0;
        int arr[] = new int[256];
        for (int i = 0; i < arr.length; i++) 
        {
                arr[i] = -1;
        }   

        //s = "a b c a b c b b"
    
        while(r < s.length())
        {
            if(arr[s.charAt(r)] != -1 && arr[s.charAt(r)] >= l) 
            {
                l = arr[s.charAt(r)] + 1;
                arr[s.charAt(r)] = r;

            }
            maxLen = Math.max(maxLen , r - l + 1);
            arr[s.charAt(r)] = r;
            r++;


         }

         return maxLen;

        
    }
}