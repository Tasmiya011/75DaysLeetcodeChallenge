class Solution {
    public int maxAscendingSum(int[] nums) {
        int currSum = nums[0], max = nums[0];
        for(int i=1; i<nums.length; i++){
            if(nums[i-1] < nums[i]){
                currSum = currSum + nums[i];       
            }else{
                max = Math.max(max, currSum);
                currSum = nums[i];
            }
        }
        max = Math.max(max, currSum);

        return max;   
    }
}