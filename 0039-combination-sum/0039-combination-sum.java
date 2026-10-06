class Solution {
    public static void findCombination(int ind , int[] candidates, int target , List<Integer> ds , List<List<Integer>> ans)
    {
        if(ind == candidates.length)
        {
            if(target == 0)
            {
                ans.add(new ArrayList<>(ds));
            }
            return;
        }

        //pick
        if(candidates[ind] <= target)
        {
            ds.add(candidates[ind]);
            findCombination(ind , candidates, target - candidates[ind] ,ds , ans);
            ds.remove(ds.size() - 1);

        }

        //Not pick
        findCombination(ind + 1 , candidates, target , ds, ans);

    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {

        List<List<Integer>> ans = new ArrayList<>();
        findCombination(0 , candidates , target , new ArrayList<>() , ans);
        return ans;
        
    }
}