class Solution {
    public int majorityElement(int[] nums) {
        int ME = 0, count = 0;

        for(int num : nums){
            if(count == 0){
                ME = num;
            }
            if(num == ME ){
                count++;
            }else{
                count--;
            }
        }
        return ME;
    }
}