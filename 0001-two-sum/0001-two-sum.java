class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map <Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int C = target - nums[i];
            if(map.containsKey(C)){ 
                return new int[] {map.get(C),i};
            }else{
                map.put(nums[i],i);
            }
        }
        throw new IllegalArgumentException("No Match");     
    }
}