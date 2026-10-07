class Solution {
    public int removeElement(int[] nums, int val) {
       Stack<Integer> stk = new Stack<>();

       for(int i = 0 ; i < nums.length ; i++)
       {
            if(nums[i] != val)
            {
                stk.push(nums[i]);
            }
       }
       int res = stk.size();

       for(int i = 0  ; i <res ; i++)
       {
        nums[i] = stk.pop();
       }

       return res;
        
    }
}