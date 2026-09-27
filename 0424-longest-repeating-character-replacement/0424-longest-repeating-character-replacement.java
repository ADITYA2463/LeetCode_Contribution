class Solution {
    public int characterReplacement(String s, int k) {
        int l = 0 ,  r = 0 , maxLen = 0 ;
        int[] HashArr =new int[26];
        int maxEle = 0 ;

        while(r < s.length())
        {
            HashArr[s.charAt(r) - 'A']++;
            maxEle = Math.max(maxEle , HashArr[s.charAt(r) - 'A'] );

            if( (r - l + 1) - maxEle > k)
            {
                HashArr[s.charAt(l) - 'A']--;
                l++;
            }

            if( ( r - l + 1) - maxEle <= k)
            {
                maxLen = Math.max(maxLen , r - l + 1);
            }

            
        r++;

        }

        return maxLen;
        
    }
}