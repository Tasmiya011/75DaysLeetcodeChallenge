class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] ans = new int[nums.length];
        
        int str = 0;
        int end = nums.length - 1;
        int p = ans.length - 1;

        while(str <= end){
            int ss = nums[str] * nums[str];
            int es = nums[end] * nums[end];

            if(ss > es){
                ans[p] = ss;
                str++;
            }else{
                ans[p] = es;
                end--;
            }
            p--;
        }
        return ans;
    }
}


