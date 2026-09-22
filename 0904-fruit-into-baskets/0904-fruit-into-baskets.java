class Solution {
    public int totalFruit(int[] fruits) {
        int l = 0 , r = 0 , maxCount = 0;
        HashMap<Integer ,Integer> map = new HashMap<>();

        while(r < fruits.length)
        {
            if(map.containsKey(fruits[r]))
            {
                map.put(fruits[r], map.getOrDefault(fruits[r], 0) + 1);
            }
            else
            {
                map.put(fruits[r] , 1);
            }

            while(map.size() > 2 && l <= r)
            {
                map.put(fruits[l], map.get(fruits[l]) - 1);
                if(map.get(fruits[l])  == 0)
                {
                    map.remove(fruits[l]);
                }
                l++;
            }

            if(map.size() <= 2)
            {
                maxCount = Math.max(maxCount , r - l + 1);
                r++;
            }
        }

        return maxCount;

    
        
    }
}