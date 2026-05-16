class Solution {
    public int dominantIndex(int[] nums) {
        int max = Integer.MIN_VALUE, smax = Integer.MIN_VALUE, maxIdx = 0;  //Integer.MIN_VALUE stores the smallest value possible

        for(int i=0; i<nums.length; i++){
        if(max < nums[i]){
            smax = max;
            max = nums[i];
            maxIdx = i;
        }else if(smax < nums[i]){
            smax = nums[i];
        }
    }
    return (max >= smax*2) ? maxIdx : -1;
    }
}