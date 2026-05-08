class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] ans = new int[nums.length];
        int str = 0;
        int end = nums.length - 1;
        int ptr = ans.length - 1;

        while(str <= end){
            int ss = nums[str] * nums[str];
            int es = nums[end] * nums[end];

            if(ss > es){
                ans[ptr] = ss;
                str++;
        }else{
            ans[ptr] = es;
            end--;
        }
        ptr--;
    }
    return ans;     
    }        
}