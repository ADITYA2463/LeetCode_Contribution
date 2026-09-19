class Solution {
    public int maxArea(int[] height) {
        int maxWater = 0;

        int start = 0 ;
        int end = height.length -1 ;
       

        while(start < end)
        {
            int minVal = Math.min(height[start], height[end]);
            int diff = end - start ;
            maxWater = Math.max(maxWater , minVal * diff);

            if(height[start] >= height[end])
            {
                end--;
            }
            else
            {
                start++;
            }
        }

        return maxWater;
        
    }
}