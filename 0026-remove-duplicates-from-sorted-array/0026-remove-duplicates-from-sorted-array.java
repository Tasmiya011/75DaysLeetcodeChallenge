class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length == 0) return 0;

        int i = 0;
        for(int j=1; j<nums.length; j++){
            if(nums[j] != nums[i]){         //is unique element
                i++;
            }
            nums[i] = nums[j];           //change the index of i to next or one with j
        }
        return i+1;       //no of unique elements
    }
}
        