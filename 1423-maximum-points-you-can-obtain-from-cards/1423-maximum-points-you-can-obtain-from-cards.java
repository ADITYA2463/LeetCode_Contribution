class Solution {
    public int maxScore(int[] cardPoints, int k) {
      int leftSum = 0 , rightSum = 0 , maxScore = 0 , n = cardPoints.length ;

      for(int i = 0 ; i <= k - 1 ; i++) leftSum = leftSum + cardPoints[i];
      maxScore = leftSum ;

      int rightInd = n - 1 ;
      for(int i = k - 1 ; i >= 0 ; i--)
      {
        leftSum = leftSum - cardPoints[i];
        rightSum = rightSum + cardPoints[rightInd];
        rightInd--;

        maxScore = Math.max(maxScore , leftSum + rightSum);
      }

      return maxScore;
        
    }
}